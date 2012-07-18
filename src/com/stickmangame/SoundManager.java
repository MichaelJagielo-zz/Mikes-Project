package com.stickmangame;


import java.util.HashMap;

import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;


public class SoundManager {
	
	static private SoundManager instance;
	private static SoundPool mSoundPool; 
	private static HashMap<Integer, Integer> mSoundPoolMap; 
	private static AudioManager  mAudioManager;
	private static Context mContext;
	
	private SoundManager() {   
	}
	
	/**
	 * Request the instance of the Sound Manager. If one does not exist, create it.
	 * 
	 * @return Returns the single instance of the SoundManager
	 */
	static synchronized public SoundManager getInstance() {
	    if (instance == null) 
	      instance = new SoundManager();
	    return instance;
	 }
	
	/**
	 * Initialize the storage for the sounds.
	 * 
	 * @param theContext The application context
	 */
	public static  void initSounds(Context the_context) 
	{ 
		 mContext = the_context;
	     mSoundPool = new SoundPool(4, AudioManager.STREAM_MUSIC, 0);
	     mSoundPoolMap = new HashMap<Integer, Integer>(); 
	     mAudioManager = (AudioManager)mContext.getSystemService(Context.AUDIO_SERVICE); 	    
	} 
	
	/**
	 * Add a new Sound to the SoundPool.
	 * 
	 * @param index - The Sound Index for Retrieval
	 * @param id - The Android ID for the Sound asset.
	 */
	public static void addSound(int index,int id)
	{
		mSoundPoolMap.put(index, mSoundPool.load(mContext, id, 1));
	}
	
	/**
	 * Load sound assets.
	 */
	//public static void loadSounds(int n, Context context, File file, int m)
	public static void loadSounds() {
		mSoundPoolMap.put(1, mSoundPool.load(mContext, R.raw.shot, 1));
		//mSoundPoolMap.put(2, mSoundPool.load(mContext, R.raw.terminator, 1));
		
		// mSoundPoolMap.put(n, mSoundPool.load(context, file, m));
	}
	
	/**
	 * Play a Sound.
	 * 
	 * @param index - The index of the Sound to be played
	 * @param speed - The speed to play not, not currently used but included for compatibility
	 */
	public static void playSound(int index, float speed) 
	{ 		
		     float streamVolume = mAudioManager.getStreamVolume(AudioManager.STREAM_MUSIC); 
		     streamVolume = streamVolume / mAudioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
		     mSoundPool.play(mSoundPoolMap.get(index), streamVolume, streamVolume, 1, 0, speed); 
	}
	
	/**
	 * Stop a Sound.
	 * @param index - index of the sound to be stopped
	 */
	public static void stopSound(int index)
	{
		mSoundPool.stop(mSoundPoolMap.get(index));
	}
	
	/**
	 * Deallocates resources and instance of SoundManager.
	 */
	public static void cleanup()
	{
		mSoundPool.release();
		mSoundPool = null;
	    mSoundPoolMap.clear();
	    mAudioManager.unloadSoundEffects();
	    instance = null;
	    
	}

	
}

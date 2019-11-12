import javax.sound.midi.*;

public class key
{
	private static int noteNumber;
	private String keyName;
	
	public key()
	{
		noteNumber=0;
		keyName=null;
	}
	
	/*
	 * This is a two argument constructor that makes up any key on the keyboard, be it a white key or a black key.
	 * The int noteNumber is the midi value the creates the note I am looking for while the name doesn't do anything other than act as a tracker of which note I'm on.
	 */
	public key(int noteNumber, String keyName)
	{
		this.noteNumber=noteNumber;
		this.keyName=keyName;
	}
	
	public void playKey()
		{
			try{
		
				Synthesizer midiSynth = MidiSystem.getSynthesizer(); 
				midiSynth.open();
				Instrument[] instr = midiSynth.getDefaultSoundbank().getInstruments();
				MidiChannel[] mChannels = midiSynth.getChannels();
				midiSynth.loadInstrument(instr[0]);//load an instrument
				mChannels[0].noteOn(noteNumber, 50);//On channel 0, play note number at a value given by the variable noteNumber with velocity of 50
				mChannels[0].noteOff(100);//turn of the note
			} catch (MidiUnavailableException e) {}
		}
		
		public static int getNoteNumber()
		{
			return noteNumber;
		}
		
	public void playElectricPiano()//play method for electric piano
		{
			try{
		
				Synthesizer midiSynth = MidiSystem.getSynthesizer(); 
				midiSynth.open();
				Instrument[] instr = midiSynth.getDefaultSoundbank().getInstruments();
				MidiChannel[] mChannels = midiSynth.getChannels();
				midiSynth.loadInstrument(instr[4]);//load an instrument
				mChannels[1].programChange(4);//change to instrument desired
				mChannels[1].noteOn(noteNumber, 50);//On channel 0, play note number at a value given by the variable noteNumber with velocity of 50
				mChannels[1].noteOff(100);//turn of the note
			} catch (MidiUnavailableException e) {}
		}
		
		public void playSteelDrum()//play method for steel drums
		{
			try{
		
				Synthesizer midiSynth = MidiSystem.getSynthesizer(); 
				midiSynth.open();
				Instrument[] instr = midiSynth.getDefaultSoundbank().getInstruments();
				MidiChannel[] mChannels = midiSynth.getChannels();
				midiSynth.loadInstrument(instr[114]);//load an instrument
				mChannels[1].programChange(114);//change to instrument desired
				mChannels[1].noteOn(noteNumber, 50);//On channel 0, play note number at a value given by the variable noteNumber with velocity of 50
				mChannels[1].noteOff(100);//turn of the note
			} catch (MidiUnavailableException e) {}
		}
		
}
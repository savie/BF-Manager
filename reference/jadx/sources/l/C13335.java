package l;

import android.content.Context;

/* JADX INFO: renamed from: l.۬᩶ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: I8CJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C13335 extends AbstractC20050 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static C13335 f44246;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final Object f44247 = new Object();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final short[] f44248;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13335 m32844(Context context) {
        C13335 c13335;
        synchronized (f44247) {
            if (f44246 == null) {
                f44246 = new C13335(C15452.m36977(context));
            }
            c13335 = f44246;
        }
        return c13335;
    }

    @Override // l.AbstractC20050
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC3820 mo32845() {
        return new C1339(this.f44248);
    }

    public C13335(short[] sArr) {
        super(new String[]{"Acoustic Grand", "Bright Acoustic", "Electric Grand", "Honky-Tonk", "Electric Piano 1", "Electric Piano 2", "Harpsichord", "Clav", "Celesta", "Glockenspiel", "Music Box", "Vibraphone", "Marimba", "Xylophone", "Tubular Bells", "Dulcimer", "Drawbar Organ", "Percussive Organ", "Rock Organ", "Church Organ", "Reed Organ", "Accordian", "Harmonica", "Tango Accordian", "Acoustic Guitar(nylon)", "Acoustic Guitar(steel)", "Electric Guitar(jazz)", "Electric Guitar(clean)", "Electric Guitar(muted)", "Overdriven Guitar", "Distortion Guitar", "Guitar Harmonics", "Acoustic Bass", "Electric Bass(finger)", "Electric Bass(pick)", "Fretless Bass", "Slap Bass 1", "Slap Bass 2", "Synth Bass 1", "Synth Bass 2", "Violin", "Viola", "Cello", "Contrabass", "Tremolo Strings", "Pizzicato Strings", "Orchestral Harp", "Timpani", "String Ensembles 1", "String Ensembles 2", "SynthStrings 1", "SynthStrings 2", "Choir Aahs", "Voice Oohs", "Synth Voice", "Orchestra Hit", "Trumpet", "Trombone", "Tuba", "Muted Trumpet", "French Horn", "Brass Section", "SynthBrass 1", "SynthBrass 2", "Soprano Sax", "Alto Sax", "Tenor Sax", "Baritone Sax", "Oboe", "English Horn", "Bassoon", "Clarinet", "Piccolo", "Flute", "Recorder", "Pan Flute", "Blown Bottle", "Skakuhachi", "Whistle", "Ocarina", "Lead 1 (square)", "Lead 2 (sawtooth)", "Lead 3 (calliope)", "Lead 4 (chiff)", "Lead 5 (charang)", "Lead 6 (voice)", "Lead 7 (fifths)", "Lead 8 (bass+lead)", "Pad 1 (new age)", "Pad 2 (warm)", "Pad 3 (polysynth)", "Pad 4 (choir)", "Pad 5 (bowed)", "Pad 6 (metallic)", "Pad 7 (halo)", "Pad 8 (sweep)", "FX 1 (rain)", "FX 2 (soundtrack)", "FX 3 (crystal)", "FX 4 (atmosphere)", "FX 5 (brightness)", "FX 6 (goblins)", "FX 7 (echoes)", "FX 8 (sci-fi)", "Sitar", "Banjo", "Shamisen", "Koto", "Kalimba", "Bagpipe", "Fiddle", "Shanai", "Tinkle Bell", "Agogo", "Steel Drums", "Woodblock", "Taiko Drum", "Melodic Tom", "Synth Drum", "Reverse Cymbal", "Guitar Fret Noise", "Breath Noise", "Seashore", "Bird Tweet", "Telephone Ring", "Helicopter", "Applause", "Gunshot", "Rhythm"});
        this.f44248 = sArr;
    }
}

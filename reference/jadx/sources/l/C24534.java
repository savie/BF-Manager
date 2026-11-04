package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.Constructor;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩺᩶ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: U8HK */
/* JADX INFO: loaded from: classes.dex */
public final class C24534 implements InterfaceC18918 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15912 f79556;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f79557 = 0;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ContextWrapper f79558;

    public C24534(ContextWrapper contextWrapper) {
        this.f79558 = contextWrapper;
        this.f79556 = new C15912(contextWrapper);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54814() {
        this.f79557 = 2;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 2 */
    @Override // l.InterfaceC18918
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC4002[] mo43927(Handler handler, InterfaceC4168 interfaceC4168, InterfaceC19729 interfaceC19729, InterfaceC2610 interfaceC2610, InterfaceC23568 interfaceC23568) {
        char c;
        char c2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        ArrayList arrayList = new ArrayList();
        int i8 = this.f79557;
        Class<?> cls = Integer.TYPE;
        Class<?> cls2 = Long.TYPE;
        ContextWrapper contextWrapper = this.f79558;
        C24371 c24371 = new C24371(contextWrapper);
        C15912 c15912 = this.f79556;
        c24371.m54489(c15912);
        c24371.m54491();
        c24371.m54487(handler);
        c24371.m54488(interfaceC4168);
        c24371.m54490();
        arrayList.add(c24371.m54486());
        if (i8 == 0) {
            c = 0;
        } else {
            int size = arrayList.size();
            if (i8 == 2) {
                size--;
            }
            int i9 = size;
            c = 0;
            try {
                try {
                    c2 = 2;
                    try {
                        i = i9 + 1;
                        try {
                            arrayList.add(i9, (InterfaceC4002) Class.forName("androidx.media3.decoder.vp9.LibvpxVideoRenderer").getConstructor(cls2, Handler.class, InterfaceC4168.class, cls).newInstance(5000L, handler, interfaceC4168, 50));
                            C1896.m6513("Loaded LibvpxVideoRenderer.");
                        } catch (ClassNotFoundException unused) {
                            i9 = i;
                            i = i9;
                        }
                    } catch (ClassNotFoundException unused2) {
                    }
                } catch (ClassNotFoundException unused3) {
                    c2 = 2;
                }
                try {
                    try {
                        Class<?> cls3 = Class.forName("androidx.media3.decoder.av1.Libgav1VideoRenderer");
                        Class<?>[] clsArr = new Class[4];
                        clsArr[0] = cls2;
                        clsArr[1] = Handler.class;
                        clsArr[c2] = InterfaceC4168.class;
                        clsArr[3] = cls;
                        Constructor<?> constructor = cls3.getConstructor(clsArr);
                        Object[] objArr = new Object[4];
                        objArr[0] = 5000L;
                        objArr[1] = handler;
                        objArr[c2] = interfaceC4168;
                        objArr[3] = 50;
                        InterfaceC4002 interfaceC4002 = (InterfaceC4002) constructor.newInstance(objArr);
                        i2 = i + 1;
                        try {
                            arrayList.add(i, interfaceC4002);
                            C1896.m6513("Loaded Libgav1VideoRenderer.");
                        } catch (ClassNotFoundException unused4) {
                            i = i2;
                            i2 = i;
                        }
                    } catch (Exception e) {
                        throw new IllegalStateException("Error instantiating AV1 extension", e);
                    }
                } catch (ClassNotFoundException unused5) {
                }
                try {
                    Class[] clsArr2 = new Class[4];
                    clsArr2[0] = cls2;
                    clsArr2[1] = Handler.class;
                    clsArr2[c2] = InterfaceC4168.class;
                    clsArr2[3] = cls;
                    Constructor constructor2 = C16130.class.getConstructor(clsArr2);
                    Object[] objArr2 = new Object[4];
                    objArr2[0] = 5000L;
                    objArr2[1] = handler;
                    objArr2[c2] = interfaceC4168;
                    objArr2[3] = 50;
                    arrayList.add(i2, (InterfaceC4002) constructor2.newInstance(objArr2));
                    C1896.m6513("Loaded FfmpegVideoRenderer.");
                } catch (ClassNotFoundException unused6) {
                } catch (Exception e2) {
                    throw new IllegalStateException("Error instantiating FFmpeg extension", e2);
                }
            } catch (Exception e3) {
                throw new IllegalStateException("Error instantiating VP9 extension", e3);
            }
        }
        C14991 c14991M24497 = new C9286(contextWrapper).m24497();
        int i10 = this.f79557;
        arrayList.add(new C24689(contextWrapper, c15912, handler, interfaceC19729, c14991M24497));
        if (i10 != 0) {
            int size2 = arrayList.size();
            if (i10 == 2) {
                size2--;
            }
            try {
                try {
                    Class[] clsArr3 = new Class[4];
                    clsArr3[c] = Context.class;
                    clsArr3[1] = Handler.class;
                    clsArr3[2] = InterfaceC19729.class;
                    clsArr3[3] = InterfaceC16745.class;
                    Constructor constructor3 = C7927.class.getConstructor(clsArr3);
                    Object[] objArr3 = new Object[4];
                    objArr3[c] = contextWrapper;
                    objArr3[1] = handler;
                    objArr3[2] = interfaceC19729;
                    objArr3[3] = c14991M24497;
                    InterfaceC4002 interfaceC4003 = (InterfaceC4002) constructor3.newInstance(objArr3);
                    i3 = size2 + 1;
                    try {
                        arrayList.add(size2, interfaceC4003);
                        C1896.m6513("Loaded MidiRenderer.");
                    } catch (ClassNotFoundException unused7) {
                        size2 = i3;
                        i3 = size2;
                    }
                } catch (ClassNotFoundException unused8) {
                }
                try {
                    try {
                        Class<?> cls4 = Class.forName("androidx.media3.decoder.opus.LibopusAudioRenderer");
                        Class<?>[] clsArr4 = new Class[3];
                        clsArr4[c] = Handler.class;
                        clsArr4[1] = InterfaceC19729.class;
                        clsArr4[2] = InterfaceC16745.class;
                        Constructor<?> constructor4 = cls4.getConstructor(clsArr4);
                        Object[] objArr4 = new Object[3];
                        objArr4[c] = handler;
                        objArr4[1] = interfaceC19729;
                        objArr4[2] = c14991M24497;
                        InterfaceC4002 interfaceC4004 = (InterfaceC4002) constructor4.newInstance(objArr4);
                        i4 = i3 + 1;
                        try {
                            arrayList.add(i3, interfaceC4004);
                            C1896.m6513("Loaded LibopusAudioRenderer.");
                        } catch (ClassNotFoundException unused9) {
                            i3 = i4;
                            i4 = i3;
                        }
                    } catch (ClassNotFoundException unused10) {
                    }
                    try {
                        try {
                            Class<?> cls5 = Class.forName("androidx.media3.decoder.flac.LibflacAudioRenderer");
                            Class<?>[] clsArr5 = new Class[3];
                            clsArr5[c] = Handler.class;
                            clsArr5[1] = InterfaceC19729.class;
                            clsArr5[2] = InterfaceC16745.class;
                            Constructor<?> constructor5 = cls5.getConstructor(clsArr5);
                            Object[] objArr5 = new Object[3];
                            objArr5[c] = handler;
                            objArr5[1] = interfaceC19729;
                            objArr5[2] = c14991M24497;
                            InterfaceC4002 interfaceC4005 = (InterfaceC4002) constructor5.newInstance(objArr5);
                            i5 = i4 + 1;
                            try {
                                arrayList.add(i4, interfaceC4005);
                                C1896.m6513("Loaded LibflacAudioRenderer.");
                            } catch (ClassNotFoundException unused11) {
                                i4 = i5;
                                i5 = i4;
                            }
                        } catch (Exception e4) {
                            throw new IllegalStateException("Error instantiating FLAC extension", e4);
                        }
                    } catch (ClassNotFoundException unused12) {
                    }
                    try {
                        try {
                            Class[] clsArr6 = new Class[3];
                            clsArr6[c] = Handler.class;
                            clsArr6[1] = InterfaceC19729.class;
                            clsArr6[2] = InterfaceC16745.class;
                            Constructor constructor6 = C3452.class.getConstructor(clsArr6);
                            Object[] objArr6 = new Object[3];
                            objArr6[c] = handler;
                            objArr6[1] = interfaceC19729;
                            objArr6[2] = c14991M24497;
                            InterfaceC4002 interfaceC4006 = (InterfaceC4002) constructor6.newInstance(objArr6);
                            i6 = i5 + 1;
                            try {
                                arrayList.add(i5, interfaceC4006);
                                C1896.m6513("Loaded FfmpegAudioRenderer.");
                            } catch (ClassNotFoundException unused13) {
                                i5 = i6;
                                i6 = i5;
                            }
                        } catch (Exception e5) {
                            throw new IllegalStateException("Error instantiating FFmpeg extension", e5);
                        }
                    } catch (ClassNotFoundException unused14) {
                    }
                    try {
                        try {
                            Class<?> cls6 = Class.forName("androidx.media3.decoder.iamf.LibiamfAudioRenderer");
                            Class<?>[] clsArr7 = new Class[4];
                            clsArr7[c] = Context.class;
                            clsArr7[1] = Handler.class;
                            clsArr7[2] = InterfaceC19729.class;
                            clsArr7[3] = InterfaceC16745.class;
                            Constructor<?> constructor7 = cls6.getConstructor(clsArr7);
                            Object[] objArr7 = new Object[4];
                            objArr7[c] = contextWrapper;
                            objArr7[1] = handler;
                            objArr7[2] = interfaceC19729;
                            objArr7[3] = c14991M24497;
                            InterfaceC4002 interfaceC4007 = (InterfaceC4002) constructor7.newInstance(objArr7);
                            i7 = i6 + 1;
                            try {
                                arrayList.add(i6, interfaceC4007);
                                C1896.m6513("Loaded LibiamfAudioRenderer.");
                            } catch (ClassNotFoundException unused15) {
                                i6 = i7;
                                i7 = i6;
                            }
                        } catch (Exception e6) {
                            throw new IllegalStateException("Error instantiating IAMF extension", e6);
                        }
                    } catch (ClassNotFoundException unused16) {
                    }
                    try {
                        Class<?> cls7 = Class.forName("androidx.media3.decoder.mpegh.MpeghAudioRenderer");
                        Class<?>[] clsArr8 = new Class[3];
                        clsArr8[c] = Handler.class;
                        clsArr8[1] = InterfaceC19729.class;
                        clsArr8[2] = InterfaceC16745.class;
                        Constructor<?> constructor8 = cls7.getConstructor(clsArr8);
                        Object[] objArr8 = new Object[3];
                        objArr8[c] = handler;
                        objArr8[1] = interfaceC19729;
                        objArr8[2] = c14991M24497;
                        arrayList.add(i7, (InterfaceC4002) constructor8.newInstance(objArr8));
                        C1896.m6513("Loaded MpeghAudioRenderer.");
                    } catch (ClassNotFoundException unused17) {
                    } catch (Exception e7) {
                        throw new IllegalStateException("Error instantiating MPEG-H extension", e7);
                    }
                } catch (Exception e8) {
                    throw new IllegalStateException("Error instantiating Opus extension", e8);
                }
            } catch (Exception e9) {
                throw new IllegalStateException("Error instantiating MIDI extension", e9);
            }
        }
        arrayList.add(new C8576(interfaceC2610, handler.getLooper()));
        Looper looper = handler.getLooper();
        arrayList.add(new C3430(interfaceC23568, looper));
        arrayList.add(new C3430(interfaceC23568, looper));
        arrayList.add(new C10133());
        arrayList.add(new C21880(new C18939(contextWrapper)));
        return (InterfaceC4002[]) arrayList.toArray(new InterfaceC4002[0]);
    }

    @Override // l.InterfaceC18918
    /* JADX INFO: renamed from: ۙ */
    public final void mo43926(InterfaceC4002 interfaceC4002) {
        interfaceC4002.getClass();
    }
}

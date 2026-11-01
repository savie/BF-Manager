package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.Constructor;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۗ᩶ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: U8HK */
/* JADX INFO: loaded from: classes2.dex */
public final class C3455 implements InterfaceC1256 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5969 f12713;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f12714 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ContextWrapper f12715;

    public C3455(ContextWrapper contextWrapper) {
        this.f12715 = contextWrapper;
        this.f12713 = new C5969(contextWrapper);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10162() {
        this.f12714 = 2;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 2 */
    @Override // l.InterfaceC1256
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC4784[] mo4566(Handler handler, InterfaceC11725 interfaceC11725, InterfaceC8688 interfaceC8688, InterfaceC22704 interfaceC22704, InterfaceC10722 interfaceC10722) {
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
        int i8 = this.f12714;
        Class<?> cls = Integer.TYPE;
        Class<?> cls2 = Long.TYPE;
        ContextWrapper contextWrapper = this.f12715;
        C13491 c13491 = new C13491(contextWrapper);
        C5969 c5969 = this.f12713;
        c13491.m33014(c5969);
        c13491.m33017();
        c13491.m33013(handler);
        c13491.m33015(interfaceC11725);
        c13491.m33016();
        arrayList.add(c13491.m33012());
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
                            arrayList.add(i9, (InterfaceC4784) Class.forName("androidx.media3.decoder.vp9.LibvpxVideoRenderer").getConstructor(cls2, Handler.class, InterfaceC11725.class, cls).newInstance(5000L, handler, interfaceC11725, 50));
                            C0303.m1851("Loaded LibvpxVideoRenderer.");
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
                        clsArr[c2] = InterfaceC11725.class;
                        clsArr[3] = cls;
                        Constructor<?> constructor = cls3.getConstructor(clsArr);
                        Object[] objArr = new Object[4];
                        objArr[0] = 5000L;
                        objArr[1] = handler;
                        objArr[c2] = interfaceC11725;
                        objArr[3] = 50;
                        InterfaceC4784 interfaceC4784 = (InterfaceC4784) constructor.newInstance(objArr);
                        i2 = i + 1;
                        try {
                            arrayList.add(i, interfaceC4784);
                            C0303.m1851("Loaded Libgav1VideoRenderer.");
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
                    clsArr2[c2] = InterfaceC11725.class;
                    clsArr2[3] = cls;
                    Constructor constructor2 = C6154.class.getConstructor(clsArr2);
                    Object[] objArr2 = new Object[4];
                    objArr2[0] = 5000L;
                    objArr2[1] = handler;
                    objArr2[c2] = interfaceC11725;
                    objArr2[3] = 50;
                    arrayList.add(i2, (InterfaceC4784) constructor2.newInstance(objArr2));
                    C0303.m1851("Loaded FfmpegVideoRenderer.");
                } catch (ClassNotFoundException unused6) {
                } catch (Exception e2) {
                    throw new IllegalStateException("Error instantiating FFmpeg extension", e2);
                }
            } catch (Exception e3) {
                throw new IllegalStateException("Error instantiating VP9 extension", e3);
            }
        }
        C7421 c7421M11324 = new C3892(contextWrapper).m11324();
        int i10 = this.f12714;
        arrayList.add(new C16594(contextWrapper, c5969, handler, interfaceC8688, c7421M11324));
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
                    clsArr3[2] = InterfaceC8688.class;
                    clsArr3[3] = InterfaceC16449.class;
                    Constructor constructor3 = C22507.class.getConstructor(clsArr3);
                    Object[] objArr3 = new Object[4];
                    objArr3[c] = contextWrapper;
                    objArr3[1] = handler;
                    objArr3[2] = interfaceC8688;
                    objArr3[3] = c7421M11324;
                    InterfaceC4784 interfaceC4785 = (InterfaceC4784) constructor3.newInstance(objArr3);
                    i3 = size2 + 1;
                    try {
                        arrayList.add(size2, interfaceC4785);
                        C0303.m1851("Loaded MidiRenderer.");
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
                        clsArr4[1] = InterfaceC8688.class;
                        clsArr4[2] = InterfaceC16449.class;
                        Constructor<?> constructor4 = cls4.getConstructor(clsArr4);
                        Object[] objArr4 = new Object[3];
                        objArr4[c] = handler;
                        objArr4[1] = interfaceC8688;
                        objArr4[2] = c7421M11324;
                        InterfaceC4784 interfaceC4786 = (InterfaceC4784) constructor4.newInstance(objArr4);
                        i4 = i3 + 1;
                        try {
                            arrayList.add(i3, interfaceC4786);
                            C0303.m1851("Loaded LibopusAudioRenderer.");
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
                            clsArr5[1] = InterfaceC8688.class;
                            clsArr5[2] = InterfaceC16449.class;
                            Constructor<?> constructor5 = cls5.getConstructor(clsArr5);
                            Object[] objArr5 = new Object[3];
                            objArr5[c] = handler;
                            objArr5[1] = interfaceC8688;
                            objArr5[2] = c7421M11324;
                            InterfaceC4784 interfaceC4787 = (InterfaceC4784) constructor5.newInstance(objArr5);
                            i5 = i4 + 1;
                            try {
                                arrayList.add(i4, interfaceC4787);
                                C0303.m1851("Loaded LibflacAudioRenderer.");
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
                            clsArr6[1] = InterfaceC8688.class;
                            clsArr6[2] = InterfaceC16449.class;
                            Constructor constructor6 = C23794.class.getConstructor(clsArr6);
                            Object[] objArr6 = new Object[3];
                            objArr6[c] = handler;
                            objArr6[1] = interfaceC8688;
                            objArr6[2] = c7421M11324;
                            InterfaceC4784 interfaceC4788 = (InterfaceC4784) constructor6.newInstance(objArr6);
                            i6 = i5 + 1;
                            try {
                                arrayList.add(i5, interfaceC4788);
                                C0303.m1851("Loaded FfmpegAudioRenderer.");
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
                            clsArr7[2] = InterfaceC8688.class;
                            clsArr7[3] = InterfaceC16449.class;
                            Constructor<?> constructor7 = cls6.getConstructor(clsArr7);
                            Object[] objArr7 = new Object[4];
                            objArr7[c] = contextWrapper;
                            objArr7[1] = handler;
                            objArr7[2] = interfaceC8688;
                            objArr7[3] = c7421M11324;
                            InterfaceC4784 interfaceC4789 = (InterfaceC4784) constructor7.newInstance(objArr7);
                            i7 = i6 + 1;
                            try {
                                arrayList.add(i6, interfaceC4789);
                                C0303.m1851("Loaded LibiamfAudioRenderer.");
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
                        clsArr8[1] = InterfaceC8688.class;
                        clsArr8[2] = InterfaceC16449.class;
                        Constructor<?> constructor8 = cls7.getConstructor(clsArr8);
                        Object[] objArr8 = new Object[3];
                        objArr8[c] = handler;
                        objArr8[1] = interfaceC8688;
                        objArr8[2] = c7421M11324;
                        arrayList.add(i7, (InterfaceC4784) constructor8.newInstance(objArr8));
                        C0303.m1851("Loaded MpeghAudioRenderer.");
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
        arrayList.add(new C14943(interfaceC22704, handler.getLooper()));
        Looper looper = handler.getLooper();
        arrayList.add(new C23422(interfaceC10722, looper));
        arrayList.add(new C23422(interfaceC10722, looper));
        arrayList.add(new C6785());
        arrayList.add(new C8086(new C1029(contextWrapper)));
        return (InterfaceC4784[]) arrayList.toArray(new InterfaceC4784[0]);
    }

    @Override // l.InterfaceC1256
    /* JADX INFO: renamed from: ۙ */
    public final void mo4565(InterfaceC4784 interfaceC4784) {
        interfaceC4784.getClass();
    }
}

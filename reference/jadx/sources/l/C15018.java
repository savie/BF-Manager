package l;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bouncycastle.crypto.hpke.HPKE;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.ܳ֫ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: G4EL */
/* JADX INFO: loaded from: classes4.dex */
public final class C15018 implements Closeable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final Logger f49053 = Logger.getLogger(C6180.class.getName());

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C19494 f49054;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC25000 f49055;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C3196 f49056;

    public C15018(InterfaceC25000 interfaceC25000) {
        this.f49055 = interfaceC25000;
        C19494 c19494 = new C19494(interfaceC25000);
        this.f49054 = c19494;
        this.f49056 = new C3196(c19494);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m36170(boolean z, C10543 c10543) throws IOException {
        short s;
        try {
            this.f49055.mo4184(9L);
            int iM36166 = m36166(this.f49055);
            if (iM36166 < 0 || iM36166 > 16384) {
                C6180.m17815("FRAME_SIZE_ERROR: %s", Integer.valueOf(iM36166));
                throw null;
            }
            byte b = (byte) (this.f49055.readByte() & 255);
            if (z && b != 4) {
                C6180.m17815("Expected a SETTINGS frame but was %s", Byte.valueOf(b));
                throw null;
            }
            byte b2 = (byte) (this.f49055.readByte() & 255);
            int i = this.f49055.readInt();
            int i2 = i & Integer.MAX_VALUE;
            Logger logger = f49053;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(C6180.m17813(true, i2, iM36166, b, b2));
            }
            switch (b) {
                case 0:
                    InterfaceC25000 interfaceC25000 = this.f49055;
                    if (i2 == 0) {
                        C6180.m17815("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
                        throw null;
                    }
                    boolean z2 = (b2 & 1) != 0;
                    if ((b2 & UTF8.S_CS3) != 0) {
                        C6180.m17815("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
                        throw null;
                    }
                    s = (b2 & 8) != 0 ? (short) (interfaceC25000.readByte() & 255) : (short) 0;
                    int iM36165 = m36165(iM36166, b2, s);
                    C22478 c22478 = c10543.f33519;
                    if (i2 != 0 && (i & 1) == 0) {
                        c22478.m50696(i2, interfaceC25000, iM36165, z2);
                    } else {
                        C11289 c11289M50691 = c22478.m50691(i2);
                        if (c11289M50691 == null) {
                            c22478.m50705(i2, EnumC15874.PROTOCOL_ERROR);
                            long j = iM36165;
                            c22478.m50707(j);
                            interfaceC25000.skip(j);
                        } else {
                            c11289M50691.m28537(interfaceC25000, iM36165);
                            if (z2) {
                                c11289M50691.m28541();
                            }
                        }
                    }
                    interfaceC25000.skip(s);
                    return true;
                case 1:
                    m36167(c10543, iM36166, b2, i2);
                    return true;
                case 2:
                    if (iM36166 != 5) {
                        C6180.m17815("TYPE_PRIORITY length: %d != 5", Integer.valueOf(iM36166));
                        throw null;
                    }
                    if (i2 == 0) {
                        C6180.m17815("TYPE_PRIORITY streamId == 0", new Object[0]);
                        throw null;
                    }
                    InterfaceC25000 interfaceC25001 = this.f49055;
                    interfaceC25001.readInt();
                    interfaceC25001.readByte();
                    return true;
                case 3:
                    if (iM36166 != 4) {
                        C6180.m17815("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(iM36166));
                        throw null;
                    }
                    if (i2 == 0) {
                        C6180.m17815("TYPE_RST_STREAM streamId == 0", new Object[0]);
                        throw null;
                    }
                    int i3 = this.f49055.readInt();
                    EnumC15874 enumC15874M37842 = EnumC15874.m37842(i3);
                    if (enumC15874M37842 == null) {
                        C6180.m17815("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(i3));
                        throw null;
                    }
                    C22478 c22479 = c10543.f33519;
                    if (i2 != 0 && (i & 1) == 0) {
                        c22479.m50695(i2, enumC15874M37842);
                        return true;
                    }
                    C11289 c11289M50703 = c22479.m50703(i2);
                    if (c11289M50703 != null) {
                        c11289M50703.m28540(enumC15874M37842);
                    }
                    return true;
                case 4:
                    InterfaceC25000 interfaceC25002 = this.f49055;
                    if (i2 != 0) {
                        C6180.m17815("TYPE_SETTINGS streamId != 0", new Object[0]);
                        throw null;
                    }
                    if ((b2 & 1) == 0) {
                        if (iM36166 % 6 != 0) {
                            C6180.m17815("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(iM36166));
                            throw null;
                        }
                        C3086 c3086 = new C3086();
                        for (int i4 = 0; i4 < iM36166; i4 += 6) {
                            int i5 = interfaceC25002.readShort() & HPKE.aead_EXPORT_ONLY;
                            int i6 = interfaceC25002.readInt();
                            if (i5 == 2) {
                                if (i6 != 0 && i6 != 1) {
                                    C6180.m17815("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                                    throw null;
                                }
                            } else if (i5 == 3) {
                                i5 = 4;
                            } else if (i5 != 4) {
                                if (i5 == 5 && (i6 < 16384 || i6 > 16777215)) {
                                    C6180.m17815("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(i6));
                                    throw null;
                                }
                            } else {
                                if (i6 < 0) {
                                    C6180.m17815("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                                    throw null;
                                }
                                i5 = 7;
                            }
                            c3086.m10056(i5, i6);
                        }
                        C22478 c224710 = c10543.f33519;
                        try {
                            c224710.f72747.execute(new C4578(c10543, new Object[]{c224710.f72725}, c3086));
                            break;
                        } catch (RejectedExecutionException unused) {
                        }
                    } else if (iM36166 != 0) {
                        C6180.m17815("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                        throw null;
                    }
                    return true;
                case 5:
                    InterfaceC25000 interfaceC25003 = this.f49055;
                    if (i2 == 0) {
                        C6180.m17815("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
                        throw null;
                    }
                    s = (b2 & 8) != 0 ? (short) (interfaceC25003.readByte() & 255) : (short) 0;
                    int i7 = interfaceC25003.readInt() & Integer.MAX_VALUE;
                    int iM36167 = m36165(iM36166 - 4, b2, s);
                    C19494 c19494 = this.f49054;
                    c19494.f62933 = iM36167;
                    c19494.f62931 = iM36167;
                    c19494.f62928 = s;
                    c19494.f62930 = b2;
                    c19494.f62932 = i2;
                    C3196 c3196 = this.f49056;
                    c3196.m10524();
                    c10543.f33519.m50698(c3196.m10523(), i7);
                    return true;
                case 6:
                    m36169(c10543, iM36166, b2, i2);
                    return true;
                case 7:
                    m36168(c10543, iM36166, i2);
                    return true;
                case 8:
                    if (iM36166 != 4) {
                        C6180.m17815("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(iM36166));
                        throw null;
                    }
                    long j2 = ((long) this.f49055.readInt()) & 2147483647L;
                    if (j2 == 0) {
                        C6180.m17815("windowSizeIncrement was 0", Long.valueOf(j2));
                        throw null;
                    }
                    if (i2 == 0) {
                        synchronized (c10543.f33519) {
                            C22478 c224711 = c10543.f33519;
                            c224711.f72744 += j2;
                            c224711.notifyAll();
                            break;
                        }
                        return true;
                    }
                    C11289 c11289M50692 = c10543.f33519.m50691(i2);
                    if (c11289M50692 != null) {
                        synchronized (c11289M50692) {
                            c11289M50692.f35597 += j2;
                            if (j2 > 0) {
                                c11289M50692.notifyAll();
                            }
                            break;
                        }
                        return true;
                    }
                    return true;
                default:
                    this.f49055.skip(iM36166);
                    return true;
            }
        } catch (IOException unused2) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m36167(C10543 c10543, int i, byte b, int i2) throws IOException {
        if (i2 == 0) {
            C6180.m17815("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
            throw null;
        }
        boolean z = (b & 1) != 0;
        short s = (b & 8) != 0 ? (short) (this.f49055.readByte() & 255) : (short) 0;
        if ((b & UTF8.S_CS3) != 0) {
            InterfaceC25000 interfaceC25000 = this.f49055;
            interfaceC25000.readInt();
            interfaceC25000.readByte();
            i -= 5;
        }
        int iM36165 = m36165(i, b, s);
        C19494 c19494 = this.f49054;
        c19494.f62933 = iM36165;
        c19494.f62931 = iM36165;
        c19494.f62928 = s;
        c19494.f62930 = b;
        c19494.f62932 = i2;
        C3196 c3196 = this.f49056;
        c3196.m10524();
        ArrayList arrayListM10523 = c3196.m10523();
        C22478 c22478 = c10543.f33519;
        if (i2 != 0 && (i2 & 1) == 0) {
            c22478.m50699(arrayListM10523, i2, z);
            return;
        }
        synchronized (c22478) {
            C11289 c11289M50691 = c10543.f33519.m50691(i2);
            if (c11289M50691 == null) {
                if (c10543.f33519.f72740) {
                    return;
                }
                C22478 c22479 = c10543.f33519;
                if (i2 <= c22479.f72732) {
                    return;
                }
                if (i2 % 2 == c22479.f72738 % 2) {
                    return;
                }
                C11289 c11289 = new C11289(i2, c10543.f33519, false, z, C19822.m45600(arrayListM10523));
                C22478 c224710 = c10543.f33519;
                c224710.f72732 = i2;
                c224710.f72729.put(Integer.valueOf(i2), c11289);
                C22478.f72723.execute(new C13636(c10543, new Object[]{c10543.f33519.f72725, Integer.valueOf(i2)}, c11289));
                return;
            }
            c11289M50691.m28535(arrayListM10523);
            if (z) {
                c11289M50691.m28541();
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m36169(C10543 c10543, int i, byte b, int i2) throws IOException {
        if (i != 8) {
            C6180.m17815("TYPE_PING length != 8: %s", Integer.valueOf(i));
            throw null;
        }
        if (i2 != 0) {
            C6180.m17815("TYPE_PING streamId != 0", new Object[0]);
            throw null;
        }
        int i3 = this.f49055.readInt();
        int i4 = this.f49055.readInt();
        if ((b & 1) == 0) {
            try {
                c10543.f33519.f72747.execute(new C6925(c10543.f33519, i3, i4));
                return;
            } catch (RejectedExecutionException unused) {
                return;
            }
        }
        synchronized (c10543.f33519) {
            try {
                if (i3 == 1) {
                    C22478.m50682(c10543.f33519);
                } else if (i3 == 2) {
                    C22478.m50678(c10543.f33519);
                } else if (i3 == 3) {
                    C22478.m50683(c10543.f33519);
                    c10543.f33519.notifyAll();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m36168(C10543 c10543, int i, int i2) throws IOException {
        C11289[] c11289Arr;
        if (i < 8) {
            C6180.m17815("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i));
            throw null;
        }
        if (i2 != 0) {
            C6180.m17815("TYPE_GOAWAY streamId != 0", new Object[0]);
            throw null;
        }
        int i3 = this.f49055.readInt();
        int i4 = this.f49055.readInt();
        int i5 = i - 8;
        if (EnumC15874.m37842(i4) == null) {
            C6180.m17815("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(i4));
            throw null;
        }
        C16794 c16794Mo4178 = C16794.f54179;
        if (i5 > 0) {
            c16794Mo4178 = this.f49055.mo4178(i5);
        }
        c16794Mo4178.mo23081();
        synchronized (c10543.f33519) {
            c11289Arr = (C11289[]) c10543.f33519.f72729.values().toArray(new C11289[c10543.f33519.f72729.size()]);
            c10543.f33519.f72740 = true;
        }
        for (C11289 c11289 : c11289Arr) {
            if (c11289.f35602 > i3 && c11289.m28543()) {
                c11289.m28540(EnumC15874.REFUSED_STREAM);
                c10543.f33519.m50703(c11289.f35602);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f49055.close();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m36166(InterfaceC25000 interfaceC25000) {
        return (interfaceC25000.readByte() & 255) | ((interfaceC25000.readByte() & 255) << 16) | ((interfaceC25000.readByte() & 255) << 8);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m36165(int i, byte b, short s) throws IOException {
        if ((b & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        C6180.m17815("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
        throw null;
    }
}

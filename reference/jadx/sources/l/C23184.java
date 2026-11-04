package l;

import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.cb;

/* JADX INFO: renamed from: l.᩹֡ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: EBAA */
/* JADX INFO: loaded from: classes.dex */
public final class C23184 extends AbstractC17216 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C18181 f75129;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C18181 f75130;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11050 f75131;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C7740 f75132;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final C9976 f75128 = new C9976("([Ljava/lang/Object;)Ljava/lang/Object;");

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final C9976 f75127 = new C9976("([Ljava/lang/Object;)V");

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final C9976 f75126 = new C9976("([Ljava/lang/Object;)Z");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:144:0x0204  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public C23184(C18708 c18708, C9012 c9012, C0063 c0063, InterfaceC11050 interfaceC11050, C18181 c18181) {
        C18181 c18182;
        super(c18708, c9012, null, c0063);
        byte b = 6;
        if (c18708.m43508() != 6) {
            throw new IllegalArgumentException("opcode with invalid branchingness: " + c18708.m43508());
        }
        if (interfaceC11050 == null) {
            throw new NullPointerException("catches == null");
        }
        this.f75131 = interfaceC11050;
        if (c18181 == null) {
            throw new NullPointerException("callSiteMethod == null");
        }
        if (!c18181.m51053()) {
            throw new IllegalArgumentException("callSiteMethod is not signature polymorphic");
        }
        this.f75130 = c18181;
        C1028 c1028M34884 = c18181.m34884();
        C9976 name = c18181.m34885().getName();
        String string = c18181.m34885().getName().getString();
        boolean zEquals = c1028M34884.equals(C1028.f3735);
        C9976 c9976 = f75128;
        if (zEquals && (string.equals("invoke") || string.equals("invokeExact"))) {
            c18182 = new C18181(c1028M34884, new C0282(name, c9976));
        } else {
            if (c1028M34884.equals(C1028.f3720)) {
                string.getClass();
                switch (string.hashCode()) {
                    case -1946504908:
                        if (!string.equals("getAndBitwiseOrRelease")) {
                            b = -1;
                        } else {
                            b = 0;
                        }
                        break;
                    case -1686727776:
                        if (!string.equals("getAndBitwiseAndRelease")) {
                            b = -1;
                        } else {
                            b = 1;
                        }
                        break;
                    case -1671098288:
                        if (!string.equals("compareAndSet")) {
                            b = -1;
                        } else {
                            b = 2;
                        }
                        break;
                    case -1292078254:
                        if (!string.equals("compareAndExchangeRelease")) {
                            b = -1;
                        } else {
                            b = 3;
                        }
                        break;
                    case -1117944904:
                        if (!string.equals("weakCompareAndSet")) {
                            b = -1;
                        } else {
                            b = 4;
                        }
                        break;
                    case -1103072857:
                        if (!string.equals("getAndAddRelease")) {
                            b = -1;
                        } else {
                            b = 5;
                        }
                        break;
                    case -1032914329:
                        if (!string.equals("getAndBitwiseAnd")) {
                            b = -1;
                        }
                        break;
                    case -1032892181:
                        if (!string.equals("getAndBitwiseXor")) {
                            b = -1;
                        } else {
                            b = 7;
                        }
                        break;
                    case -794517348:
                        if (!string.equals("getAndBitwiseXorRelease")) {
                            b = -1;
                        } else {
                            b = 8;
                        }
                        break;
                    case -567150350:
                        if (!string.equals("weakCompareAndSetPlain")) {
                            b = -1;
                        } else {
                            b = 9;
                        }
                        break;
                    case -240822786:
                        if (!string.equals("weakCompareAndSetAcquire")) {
                            b = -1;
                        } else {
                            b = 10;
                        }
                        break;
                    case -230706875:
                        if (!string.equals("setRelease")) {
                            b = -1;
                        } else {
                            b = 11;
                        }
                        break;
                    case -127361888:
                        if (!string.equals("getAcquire")) {
                            b = -1;
                        } else {
                            b = 12;
                        }
                        break;
                    case -37641530:
                        if (!string.equals("getAndSetRelease")) {
                            b = -1;
                        } else {
                            b = cb.k;
                        }
                        break;
                    case 102230:
                        if (!string.equals("get")) {
                            b = -1;
                        } else {
                            b = cb.f82047l;
                        }
                        break;
                    case 113762:
                        if (!string.equals("set")) {
                            b = -1;
                        } else {
                            b = 15;
                        }
                        break;
                    case 93645315:
                        if (!string.equals("getAndBitwiseOrAcquire")) {
                            b = -1;
                        } else {
                            b = 16;
                        }
                        break;
                    case 101293086:
                        if (!string.equals("setVolatile")) {
                            b = -1;
                        } else {
                            b = 17;
                        }
                        break;
                    case 189872914:
                        if (!string.equals("getVolatile")) {
                            b = -1;
                        } else {
                            b = 18;
                        }
                        break;
                    case 282707520:
                        if (!string.equals("getAndAdd")) {
                            b = -1;
                        } else {
                            b = 19;
                        }
                        break;
                    case 282724865:
                        if (!string.equals("getAndSet")) {
                            b = -1;
                        } else {
                            b = 20;
                        }
                        break;
                    case 353422447:
                        if (!string.equals("getAndBitwiseAndAcquire")) {
                            b = -1;
                        } else {
                            b = 21;
                        }
                        break;
                    case 470702883:
                        if (!string.equals("setOpaque")) {
                            b = -1;
                        } else {
                            b = 22;
                        }
                        break;
                    case 685319959:
                        if (!string.equals("getOpaque")) {
                            b = -1;
                        } else {
                            b = 23;
                        }
                        break;
                    case 748071969:
                        if (!string.equals("compareAndExchangeAcquire")) {
                            b = -1;
                        } else {
                            b = 24;
                        }
                        break;
                    case 937077366:
                        if (!string.equals("getAndAddAcquire")) {
                            b = -1;
                        } else {
                            b = 25;
                        }
                        break;
                    case 1245632875:
                        if (!string.equals("getAndBitwiseXorAcquire")) {
                            b = -1;
                        } else {
                            b = 26;
                        }
                        break;
                    case 1352153939:
                        if (!string.equals("getAndBitwiseOr")) {
                            b = -1;
                        } else {
                            b = 27;
                        }
                        break;
                    case 1483964149:
                        if (!string.equals("compareAndExchange")) {
                            b = -1;
                        } else {
                            b = ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB;
                        }
                        break;
                    case 2002508693:
                        if (!string.equals("getAndSetAcquire")) {
                            b = -1;
                        } else {
                            b = 29;
                        }
                        break;
                    case 2013994287:
                        if (!string.equals("weakCompareAndSetRelease")) {
                            b = -1;
                        } else {
                            b = 30;
                        }
                        break;
                    default:
                        b = -1;
                        break;
                }
                switch (b) {
                    case 0:
                    case 1:
                    case 3:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 12:
                    case 13:
                    case 14:
                    case 16:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                        c18182 = new C18181(c1028M34884, new C0282(name, c9976));
                        break;
                    case 2:
                    case 4:
                    case 9:
                    case 10:
                    case 30:
                        c18182 = new C18181(c1028M34884, new C0282(name, f75126));
                        break;
                    case 11:
                    case 15:
                    case 17:
                    case 22:
                        c18182 = new C18181(c1028M34884, new C0282(name, f75127));
                        break;
                }
            }
            throw new IllegalArgumentException("Unknown signature polymorphic method: " + c18181.mo1843());
        }
        this.f75129 = c18182;
        this.f75132 = new C7740(c18181.m51052(true));
    }

    @Override // l.AbstractC17216
    /* JADX INFO: renamed from: ۤ */
    public final InterfaceC11050 mo7781() {
        return this.f75131;
    }

    @Override // l.AbstractC17216
    /* JADX INFO: renamed from: ۙ */
    public final void mo7779(InterfaceC16470 interfaceC16470) {
        interfaceC16470.mo39059(this);
    }

    @Override // l.AbstractC17216
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC17216 mo7777(C5085 c5085) {
        return new C23184(m40434(), m40433(), m40438(), this.f75131.mo1038(c5085), this.f75130);
    }

    @Override // l.AbstractC17216
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC17216 mo7778(C20946 c20946, C0063 c0063) {
        return new C23184(m40434(), m40433(), c0063, this.f75131, this.f75130);
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C18181 m52110() {
        return this.f75129;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C7740 m52111() {
        return this.f75132;
    }

    @Override // l.AbstractC17216
    /* JADX INFO: renamed from: ᩸ */
    public final String mo7782() {
        return this.f75129.toString() + " " + this.f75132.toString() + " " + C6776.m18898(this.f75131);
    }
}

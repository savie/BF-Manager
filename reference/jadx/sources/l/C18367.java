package l;

import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.cb;

/* JADX INFO: renamed from: l.ᩳ᩺ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: EBAA */
/* JADX INFO: loaded from: classes5.dex */
public final class C18367 extends AbstractC15546 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final InterfaceC14093 f58578;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C20255 f58579;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C20255 f58580;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C16727 f58581;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final C17432 f58577 = new C17432("([Ljava/lang/Object;)Ljava/lang/Object;");

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C17432 f58575 = new C17432("([Ljava/lang/Object;)V");

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final C17432 f58576 = new C17432("([Ljava/lang/Object;)Z");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:144:0x0204  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public C18367(C12723 c12723, C11312 c11312, C0727 c0727, InterfaceC14093 interfaceC14093, C20255 c20255) {
        C20255 c20256;
        super(c12723, c11312, null, c0727);
        byte b = 6;
        if (c12723.m31577() != 6) {
            throw new IllegalArgumentException("opcode with invalid branchingness: " + c12723.m31577());
        }
        if (interfaceC14093 == null) {
            throw new NullPointerException("catches == null");
        }
        this.f58578 = interfaceC14093;
        if (c20255 == null) {
            throw new NullPointerException("callSiteMethod == null");
        }
        if (!c20255.m29455()) {
            throw new IllegalArgumentException("callSiteMethod is not signature polymorphic");
        }
        this.f58580 = c20255;
        C6143 c6143M47134 = c20255.m47134();
        C17432 name = c20255.m47133().getName();
        String string = c20255.m47133().getName().getString();
        boolean zEquals = c6143M47134.equals(C6143.f20962);
        C17432 c17432 = f58577;
        if (zEquals && (string.equals("invoke") || string.equals("invokeExact"))) {
            c20256 = new C20255(c6143M47134, new C0498(name, c17432));
        } else {
            if (c6143M47134.equals(C6143.f20973)) {
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
                            b = cb.f77931l;
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
                        c20256 = new C20255(c6143M47134, new C0498(name, c17432));
                        break;
                    case 2:
                    case 4:
                    case 9:
                    case 10:
                    case 30:
                        c20256 = new C20255(c6143M47134, new C0498(name, f58576));
                        break;
                    case 11:
                    case 15:
                    case 17:
                    case 22:
                        c20256 = new C20255(c6143M47134, new C0498(name, f58575));
                        break;
                }
            }
            throw new IllegalArgumentException("Unknown signature polymorphic method: " + c20255.mo2376());
        }
        this.f58579 = c20256;
        this.f58581 = new C16727(c20255.m29453(true));
    }

    @Override // l.AbstractC15546
    /* JADX INFO: renamed from: ۨ */
    public final InterfaceC14093 mo6700() {
        return this.f58578;
    }

    @Override // l.AbstractC15546
    /* JADX INFO: renamed from: ۙ */
    public final void mo6699(InterfaceC23307 interfaceC23307) {
        interfaceC23307.mo8608(this);
    }

    @Override // l.AbstractC15546
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC15546 mo6697(C3320 c3320) {
        return new C18367(m37181(), m37183(), m37186(), this.f58578.mo3156(c3320), this.f58580);
    }

    @Override // l.AbstractC15546
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC15546 mo6698(C16251 c16251, C0727 c0727) {
        return new C18367(m37181(), m37183(), c0727, this.f58578, this.f58580);
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C20255 m42615() {
        return this.f58579;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C16727 m42616() {
        return this.f58581;
    }

    @Override // l.AbstractC15546
    /* JADX INFO: renamed from: ۖ */
    public final String mo6696() {
        return this.f58579.toString() + " " + this.f58581.toString() + " " + C2138.m6695(this.f58578);
    }
}

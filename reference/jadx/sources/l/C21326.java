package l;

import java.util.ArrayList;
import java.util.IdentityHashMap;
import org.bouncycastle.crypto.engines.ThreefishEngine;

/* JADX INFO: renamed from: l.᩶۫᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: H6OP */
/* JADX INFO: loaded from: classes5.dex */
public final class C21326 implements InterfaceC10432 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean f67942;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f67945;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C4172 f67946;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f67943 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final IdentityHashMap f67941 = new IdentityHashMap();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final IdentityHashMap f67944 = new IdentityHashMap();

    public C21326(boolean z, boolean z2, boolean z3) {
        this.f67942 = z;
        this.f67945 = z2;
        this.f67946 = z3 ? new C4172() : null;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0078  */
    @Override // l.InterfaceC10432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo26785(C7998 c7998) {
        int iMo1229;
        C7155.m19727();
        C4172 c4172 = this.f67946;
        if (c4172 != null) {
            c4172.m13337(c7998);
        }
        if (this.f67945) {
            if (this.f67942) {
                if (c7998 instanceof C20580) {
                    iMo1229 = -2;
                } else if (c7998 instanceof C16104) {
                    iMo1229 = -3;
                } else {
                    iMo1229 = -1;
                }
            } else {
                iMo1229 = c7998.mo1229();
                if (iMo1229 != 1 && iMo1229 != 2 && iMo1229 != 8 && iMo1229 != 9 && iMo1229 != 14 && iMo1229 != 15 && iMo1229 != 17 && iMo1229 != 18 && iMo1229 != 40 && iMo1229 != 41 && iMo1229 != 50 && iMo1229 != 51 && iMo1229 != 54 && iMo1229 != 55 && iMo1229 != 30 && iMo1229 != 34 && iMo1229 != 43 && iMo1229 != 47 && iMo1229 != 72) {
                    switch (iMo1229) {
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            break;
                        default:
                            switch (iMo1229) {
                                case 57:
                                case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                                case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                                case 60:
                                    break;
                                default:
                                    switch (iMo1229) {
                                        case 63:
                                        case 64:
                                        case 65:
                                        case 66:
                                        case 67:
                                        case 68:
                                            break;
                                        default:
                                            iMo1229 = -1;
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                }
            }
            if (iMo1229 == -1) {
                return;
            }
            C2680 c2680 = new C2680(iMo1229, c7998);
            this.f67943.add(c2680);
            this.f67941.put(c7998, c2680);
        }
    }

    @Override // l.InterfaceC10432
    /* JADX INFO: renamed from: ۙ */
    public final void mo26782(C7998 c7998) {
        C2680 c2680;
        InterfaceC8743 interfaceC8743;
        C7155.m19727();
        C4172 c4172 = this.f67946;
        if (c4172 != null) {
            c4172.m13339(c7998);
        }
        IdentityHashMap identityHashMap = this.f67941;
        C2680 c2681 = (C2680) identityHashMap.remove(c7998);
        if (c2681 != null && (interfaceC8743 = c7998.f26548) != null) {
            c2681.f8519 = interfaceC8743.mo23438();
        }
        C7998 c7999 = c7998.f9157;
        C2680 c2682 = (C2680) identityHashMap.get(c7999);
        if ((c7998 instanceof C20777) && c2682 != null) {
            c2682.f8520 = true;
        }
        if ((c7998 instanceof C6475) && (c7999 instanceof C24375) && c2682 != null && c2682.f8526 < 0) {
            c2682.f8526 = c7998.f26549.mo23438();
        }
        IdentityHashMap identityHashMap2 = this.f67944;
        if (c2681 != null && c2681.f8523) {
            identityHashMap2.put(c7999, c2681);
        }
        if ((c7998 instanceof C15555) && (c2680 = (C2680) identityHashMap2.get(c7999)) != null) {
            c2680.f8523 = false;
        }
        if (c7998 instanceof C15423) {
            identityHashMap2.remove(c7998);
        }
        c7998.f26547 = null;
    }

    @Override // l.InterfaceC10432
    /* JADX INFO: renamed from: ۙ */
    public final void mo26784(C9686 c9686) {
        InterfaceC8743 interfaceC8743 = c9686.f31273;
        C7998 c7998 = (C7998) c9686.f31272;
        C2680 c2680 = (C2680) this.f67941.get(c7998);
        if (c2680 != null) {
            c2680.m8849(interfaceC8743);
        }
        C4172 c4172 = this.f67946;
        if (c4172 != null) {
            c4172.m13338(c7998, interfaceC8743);
        }
        c7998.f26547.clear();
    }

    @Override // l.InterfaceC10432
    /* JADX INFO: renamed from: ۙ */
    public final void mo26783(C8196 c8196) {
        mo26784((C9686) c8196);
    }
}

package l;

import java.util.ArrayList;
import java.util.IdentityHashMap;
import org.bouncycastle.crypto.engines.ThreefishEngine;

/* JADX INFO: renamed from: l.ۚۛۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: H6OP */
/* JADX INFO: loaded from: classes3.dex */
public final class C5161 implements InterfaceC21337 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C11512 f17908;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean f17911;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f17912;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ArrayList f17913 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final IdentityHashMap f17909 = new IdentityHashMap();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final IdentityHashMap f17910 = new IdentityHashMap();

    public C5161(boolean z, boolean z2, boolean z3) {
        this.f17911 = z;
        this.f17912 = z2;
        this.f17908 = z3 ? new C11512() : null;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0078  */
    @Override // l.InterfaceC21337
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo14310(C23289 c23289) {
        int iMo1058;
        C18567.m42975();
        C11512 c11512 = this.f17908;
        if (c11512 != null) {
            c11512.m28696(c23289);
        }
        if (this.f17912) {
            if (this.f17911) {
                if (c23289 instanceof C9726) {
                    iMo1058 = -2;
                } else if (c23289 instanceof C23837) {
                    iMo1058 = -3;
                } else {
                    iMo1058 = -1;
                }
            } else {
                iMo1058 = c23289.mo1058();
                if (iMo1058 != 1 && iMo1058 != 2 && iMo1058 != 8 && iMo1058 != 9 && iMo1058 != 14 && iMo1058 != 15 && iMo1058 != 17 && iMo1058 != 18 && iMo1058 != 40 && iMo1058 != 41 && iMo1058 != 50 && iMo1058 != 51 && iMo1058 != 54 && iMo1058 != 55 && iMo1058 != 30 && iMo1058 != 34 && iMo1058 != 43 && iMo1058 != 47 && iMo1058 != 72) {
                    switch (iMo1058) {
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            break;
                        default:
                            switch (iMo1058) {
                                case 57:
                                case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                                case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                                case 60:
                                    break;
                                default:
                                    switch (iMo1058) {
                                        case 63:
                                        case 64:
                                        case 65:
                                        case 66:
                                        case 67:
                                        case 68:
                                            break;
                                        default:
                                            iMo1058 = -1;
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                }
            }
            if (iMo1058 == -1) {
                return;
            }
            C21389 c21389 = new C21389(iMo1058, c23289);
            this.f17913.add(c21389);
            this.f17909.put(c23289, c21389);
        }
    }

    @Override // l.InterfaceC21337
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo14309(C23289 c23289) {
        C21389 c21389;
        InterfaceC19761 interfaceC19761;
        C18567.m42975();
        C11512 c11512 = this.f17908;
        if (c11512 != null) {
            c11512.m28698(c23289);
        }
        IdentityHashMap identityHashMap = this.f17909;
        C21389 c213810 = (C21389) identityHashMap.remove(c23289);
        if (c213810 != null && (interfaceC19761 = c23289.f75537) != null) {
            c213810.f69544 = interfaceC19761.mo22511();
        }
        C23289 c232810 = c23289.f29378;
        C21389 c213811 = (C21389) identityHashMap.get(c232810);
        if ((c23289 instanceof C9706) && c213811 != null) {
            c213811.f69545 = true;
        }
        if ((c23289 instanceof C4786) && (c232810 instanceof C13960) && c213811 != null && c213811.f69549 < 0) {
            c213811.f69549 = c23289.f75536.mo22511();
        }
        IdentityHashMap identityHashMap2 = this.f17910;
        if (c213810 != null && c213810.f69542) {
            identityHashMap2.put(c232810, c213810);
        }
        if ((c23289 instanceof C16056) && (c21389 = (C21389) identityHashMap2.get(c232810)) != null) {
            c21389.f69542 = false;
        }
        if (c23289 instanceof C15932) {
            identityHashMap2.remove(c23289);
        }
        c23289.f75538 = null;
    }

    @Override // l.InterfaceC21337
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo14307(C18515 c18515) {
        InterfaceC19761 interfaceC19761 = c18515.f58967;
        C23289 c23289 = (C23289) c18515.f58966;
        C21389 c21389 = (C21389) this.f17909.get(c23289);
        if (c21389 != null) {
            c21389.m47938(interfaceC19761);
        }
        C11512 c11512 = this.f17908;
        if (c11512 != null) {
            c11512.m28697(c23289, interfaceC19761);
        }
        c23289.f75538.clear();
    }

    @Override // l.InterfaceC21337
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo14308(C22749 c22749) {
        mo14307((C18515) c22749);
    }
}

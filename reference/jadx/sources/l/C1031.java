package l;

import com.alipay.sdk.m.y.q;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: l.֨ۢۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6OZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C1031 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean[] f4812;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean[] f4813;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean[] f4814;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int[] f4815;

    /* JADX WARN: Code duplicated, block: B:38:0x00af  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:48:0x00cf A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:49:0x00d1  */
    /* JADX WARN: Instruction removed from duplicated block: B:48:0x00cf, please report this as an issue */
    public C1031(C23289 c23289, int i, C21493 c21493) {
        boolean z;
        this.f4812 = new boolean[i];
        this.f4814 = new boolean[i];
        this.f4815 = new int[i];
        this.f4813 = new boolean[i];
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(c23289);
        while (!arrayDeque.isEmpty()) {
            c21493.m48131();
            C23289 c232810 = (C23289) arrayDeque.pop();
            int iMo1058 = c232810.mo1058();
            if (iMo1058 == 162 || iMo1058 == 167) {
                this.f4815[c232810.f75536.mo22511()] = c232810.f75537.mo22511();
            } else {
                for (int i2 = 0; i2 < c232810.getChildCount(); i2++) {
                    InterfaceC14988 interfaceC14988Mo22136 = c232810.mo22136(i2);
                    if (interfaceC14988Mo22136 instanceof C23289) {
                        arrayDeque.push((C23289) interfaceC14988Mo22136);
                    } else if (interfaceC14988Mo22136 instanceof InterfaceC17809) {
                        InterfaceC19761 interfaceC19761Mo41396 = ((InterfaceC17809) interfaceC14988Mo22136).mo41396();
                        boolean[] zArr = this.f4812;
                        boolean[] zArr2 = this.f4814;
                        int iMo22511 = interfaceC19761Mo41396.mo22511();
                        int iMo1059 = c232810.mo1058();
                        String text = interfaceC19761Mo41396.getText();
                        boolean[] zArr3 = this.f4813;
                        boolean z2 = true;
                        if (iMo1059 != 109) {
                            if (iMo1059 != 139) {
                                if (iMo1059 != 178) {
                                    if (iMo1059 == 117 || iMo1059 == 118) {
                                        if (iMo22511 != c232810.f75536.mo22511()) {
                                        }
                                    } else {
                                        switch (iMo1059) {
                                            case 122:
                                            case 123:
                                            case 124:
                                            case q.h /* 125 */:
                                            case 126:
                                            case 127:
                                            case 128:
                                            case 129:
                                            case 130:
                                            case 131:
                                            case 132:
                                            case 133:
                                            case 134:
                                            case 135:
                                            case 136:
                                            case 137:
                                                if (iMo22511 != c232810.f75536.mo22511()) {
                                                    break;
                                                }
                                            default:
                                                break;
                                        }
                                    }
                                } else {
                                    z = text.equals("async") || (text.equals("for") && !c232810.f75536.getText().equals("async")) || text.equals("if");
                                }
                            } else if (iMo22511 != c232810.f75536.mo22511() || (c232810.mo22136(0) instanceof C23289)) {
                            }
                        } else if (text.equals("if") || text.equals("else")) {
                        }
                        zArr3[iMo22511] = z;
                        if ((text.equals(BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX) || text.equals("-") || text.equals("~")) && iMo1059 == 138) {
                            zArr2[iMo22511] = true;
                        } else if ((text.equals("*") || text.equals("**")) && iMo1059 != 137 && iMo1059 != 139 && iMo1059 != 63) {
                            zArr2[iMo22511] = true;
                        } else if (text.equals("*") && iMo1059 == 63) {
                            zArr[iMo22511] = true;
                        } else if (text.equals("@") && iMo1059 == 34) {
                            zArr2[iMo22511] = true;
                        } else if (text.equals(":") && iMo1059 == 143) {
                            zArr[iMo22511] = true;
                            zArr2[iMo22511] = true;
                        } else if (text.equals("=")) {
                            boolean z3 = iMo1059 == 187 || iMo1059 == 188 || iMo1059 == 100;
                            if (iMo1059 == 53) {
                                InterfaceC14988 interfaceC14988Mo22137 = c232810.f29378.mo22136(0);
                                if ((interfaceC14988Mo22137 instanceof C15219) && ((C16555) ((C15219) interfaceC14988Mo22137).m51374(C16555.class, 0)) != null) {
                                    z2 = false;
                                }
                                z3 = z2;
                            }
                            zArr[iMo22511] = z3;
                            zArr2[iMo22511] = z3;
                        } else if (text.equals("/") && (iMo1059 == 41 || iMo1059 == 42 || iMo1059 == 149 || iMo1059 == 150)) {
                            zArr2[iMo22511] = true;
                        } else if (text.equals(MotionUtils.EASING_TYPE_FORMAT_START) || text.equals("[")) {
                            zArr[iMo22511] = iMo1059 == 141 || iMo1059 == 197 || iMo1059 == 38 || iMo1059 == 36 || iMo1059 == 97 || iMo1059 == 102 || iMo1059 == 193 || iMo1059 == 196;
                            if (iMo1059 == 181) {
                                int iMo10510 = c232810.f29378.mo1058();
                                if (iMo10510 != 141 && iMo10510 != 197) {
                                    z2 = false;
                                }
                                zArr[iMo22511] = z2;
                            }
                        }
                    }
                }
            }
        }
    }
}

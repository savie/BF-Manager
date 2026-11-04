package l;

import com.alipay.sdk.m.y.q;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.motion.MotionUtils;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: l.֨ܺ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6OZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C1298 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean[] f4636;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean[] f4637;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean[] f4638;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean[] f4639;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int[] f4640;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean[] f4641;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean[] f4642;

    /* JADX WARN: Code duplicated, block: B:100:0x015a A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:101:0x015c  */
    /* JADX WARN: Code duplicated, block: B:29:0x009b  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a5 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:68:0x00f8 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:90:0x013a  */
    /* JADX WARN: Code duplicated, block: B:92:0x0142  */
    /* JADX WARN: Instruction removed from duplicated block: B:100:0x015a, please report this as an issue */
    public C1298(C7998 c7998, int i, C5049 c5049) {
        boolean z;
        boolean z2;
        boolean z3;
        this.f4638 = new boolean[i];
        this.f4639 = new boolean[i];
        this.f4640 = new int[i];
        this.f4641 = new boolean[i];
        this.f4637 = new boolean[i];
        this.f4642 = new boolean[i];
        this.f4636 = new boolean[i];
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(c7998);
        while (!arrayDeque.isEmpty()) {
            c5049.m15284();
            C7998 c7999 = (C7998) arrayDeque.pop();
            int iMo1229 = c7999.mo1229();
            if (iMo1229 == 5 || iMo1229 == 67) {
                this.f4637[c7999.f26549.mo23438()] = true;
            }
            if (iMo1229 == 162 || iMo1229 == 167) {
                this.f4640[c7999.f26549.mo23438()] = c7999.f26548.mo23438();
            } else {
                for (int i2 = 0; i2 < c7999.getChildCount(); i2++) {
                    InterfaceC19383 interfaceC19383Mo9151 = c7999.mo9151(i2);
                    if (interfaceC19383Mo9151 instanceof C7998) {
                        arrayDeque.push((C7998) interfaceC19383Mo9151);
                    } else if (interfaceC19383Mo9151 instanceof InterfaceC1484) {
                        InterfaceC8743 interfaceC8743Mo5285 = ((InterfaceC1484) interfaceC19383Mo9151).mo5285();
                        boolean[] zArr = this.f4638;
                        boolean[] zArr2 = this.f4639;
                        int iMo23438 = interfaceC8743Mo5285.mo23438();
                        int iMo12210 = c7999.mo1229();
                        String text = interfaceC8743Mo5285.getText();
                        boolean[] zArr3 = this.f4636;
                        if (iMo12210 == 55 || iMo12210 == 56) {
                            if (iMo23438 == c7999.f26549.mo23438()) {
                                z = true;
                            } else {
                                z = false;
                            }
                        } else {
                            switch (iMo12210) {
                                case 62:
                                case 63:
                                case 64:
                                    if (iMo23438 == c7999.f26549.mo23438()) {
                                        z = true;
                                        break;
                                    }
                                default:
                                    z = false;
                                    break;
                            }
                        }
                        zArr3[iMo23438] = z;
                        if (interfaceC8743Mo5285.getType() == 20) {
                            boolean[] zArr4 = this.f4642;
                            if (iMo12210 != 27 && iMo12210 != 28 && iMo12210 != 89 && iMo12210 != 90 && iMo12210 != 93 && iMo12210 != 94 && iMo12210 != 103 && iMo12210 != 113 && iMo12210 != 142 && iMo12210 != 171 && iMo12210 != 174 && iMo12210 != 198 && iMo12210 != 190 && iMo12210 != 191) {
                                switch (iMo12210) {
                                    default:
                                        switch (iMo12210) {
                                            default:
                                                switch (iMo12210) {
                                                    default:
                                                        switch (iMo12210) {
                                                            case 183:
                                                            case 184:
                                                            case 185:
                                                                break;
                                                            default:
                                                                z3 = false;
                                                                break;
                                                        }
                                                    case 97:
                                                    case 98:
                                                    case q.f /* 99 */:
                                                        z3 = true;
                                                        break;
                                                }
                                            case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                                            case 46:
                                            case 47:
                                            case 48:
                                                z3 = true;
                                                break;
                                        }
                                    case 41:
                                    case 42:
                                    case 43:
                                        z3 = true;
                                        break;
                                }
                            } else {
                                z3 = true;
                            }
                            zArr4[iMo23438] = z3;
                        }
                        boolean[] zArr5 = this.f4641;
                        if (iMo12210 != 109) {
                            if (iMo12210 != 139) {
                                if (iMo12210 != 178) {
                                    if (iMo12210 == 117 || iMo12210 == 118) {
                                        if (iMo23438 != c7999.f26549.mo23438()) {
                                        }
                                    } else {
                                        switch (iMo12210) {
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
                                                if (iMo23438 != c7999.f26549.mo23438()) {
                                                    break;
                                                }
                                            default:
                                                break;
                                        }
                                    }
                                } else {
                                    z2 = text.equals("async") || (text.equals("for") && !c7999.f26549.getText().equals("async")) || text.equals("if");
                                }
                            } else if (iMo23438 != c7999.f26549.mo23438() || (c7999.mo9151(0) instanceof C7998)) {
                            }
                        } else if (text.equals("if") || text.equals("else")) {
                        }
                        zArr5[iMo23438] = z2;
                        if ((text.equals(BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX) || text.equals("-") || text.equals("~")) && iMo12210 == 138) {
                            zArr2[iMo23438] = true;
                        } else if ((text.equals("*") || text.equals("**")) && iMo12210 != 137 && iMo12210 != 139 && iMo12210 != 63) {
                            zArr2[iMo23438] = true;
                        } else if (text.equals("*") && iMo12210 == 63) {
                            zArr[iMo23438] = true;
                        } else if (text.equals("@") && iMo12210 == 34) {
                            zArr2[iMo23438] = true;
                        } else if (text.equals(":") && iMo12210 == 143) {
                            zArr[iMo23438] = true;
                            zArr2[iMo23438] = true;
                        } else if (text.equals("=")) {
                            boolean z4 = iMo12210 == 187 || iMo12210 == 188 || iMo12210 == 100;
                            if (iMo12210 == 53) {
                                InterfaceC19383 interfaceC19383Mo9152 = c7999.f9157.mo9151(0);
                                z4 = !(interfaceC19383Mo9152 instanceof C13582) || ((C17727) ((C13582) interfaceC19383Mo9152).m21805(C17727.class, 0)) == null;
                            }
                            zArr[iMo23438] = z4;
                            zArr2[iMo23438] = z4;
                        } else if (text.equals("/") && (iMo12210 == 41 || iMo12210 == 42 || iMo12210 == 149 || iMo12210 == 150)) {
                            zArr2[iMo23438] = true;
                        } else if (text.equals(MotionUtils.EASING_TYPE_FORMAT_START) || text.equals("[")) {
                            zArr[iMo23438] = iMo12210 == 141 || iMo12210 == 197 || iMo12210 == 38 || iMo12210 == 36 || iMo12210 == 97 || iMo12210 == 102 || iMo12210 == 193 || iMo12210 == 196;
                            if (iMo12210 == 181) {
                                int iMo12211 = c7999.f9157.mo1229();
                                zArr[iMo23438] = iMo12211 == 141 || iMo12211 == 197;
                            }
                        }
                    }
                }
            }
        }
    }
}

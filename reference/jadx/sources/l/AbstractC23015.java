package l;

import com.alipay.sdk.m.w.a;
import com.alipay.sdk.m.y.l;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.motion.MotionUtils;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.analytics.pro.bo;
import com.umeng.analytics.pro.cb;
import java.util.ArrayDeque;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.bouncycastle.crypto.engines.ThreefishEngine;
import org.bouncycastle.util.encoders.UTF8;
import org.simpleframework.xml.strategy.Name;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.᩸ᩴ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 86QM */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23015 extends AbstractC14709 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f74682;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f74683;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f74684;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f74685;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f74686;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public Boolean f74687;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f74688;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public String f74689;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f74690;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f74691;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C14612 f74692;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Boolean f74693;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public String f74694;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f74695;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f74696;

    public AbstractC23015(InterfaceC17693 interfaceC17693) {
        super(interfaceC17693);
        this.f74688 = new ArrayDeque();
        this.f74696 = new ArrayDeque();
        this.f74686 = new ArrayDeque();
        this.f74685 = true;
        this.f74683 = true;
        this.f74689 = "";
        this.f74694 = "";
        this.f74691 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51910(boolean z) {
        this.f74695 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51909(C14612 c14612) {
        this.f74692 = c14612;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m51914() {
        if (!this.f74695) {
            InterfaceC17693 interfaceC17693 = this.f48057;
            int iIndex = interfaceC17693.index() - this.f48060;
            if (iIndex == 4) {
                int i = 0;
                while (interfaceC17693.mo11537(((-iIndex) - 1) - i) == 60) {
                    i++;
                }
                if ((i & 1) == 0) {
                    return true;
                }
            } else {
                return this.f74691;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m51911() {
        if (this.f74695 || !this.f74685) {
            return false;
        }
        InterfaceC17693 interfaceC17693 = this.f48057;
        return (interfaceC17693.mo11537(1) == 42 || interfaceC17693.mo11537(1) == 47) ? false : true;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final void m51908() {
        this.f74690++;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void m51913() {
        this.f74688.push(Integer.valueOf(this.f74690));
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m51912() {
        ArrayDeque arrayDeque = this.f74688;
        if (!arrayDeque.isEmpty() && ((Integer) arrayDeque.peek()).intValue() == this.f74690) {
            arrayDeque.pop();
            m35380();
        } else {
            this.f74690--;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:118:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:125:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:433:0x05e9  */
    /* JADX WARN: Code duplicated, block: B:447:0x060f  */
    /* JADX WARN: Code duplicated, block: B:448:0x0611  */
    /* JADX WARN: Code duplicated, block: B:501:0x06b1  */
    /* JADX WARN: Code duplicated, block: B:504:0x06bf  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // l.AbstractC14709, l.InterfaceC13963
    public final InterfaceC8743 nextToken() {
        Object obj;
        Object obj2;
        byte b;
        boolean z;
        boolean z2;
        boolean z3;
        byte b2;
        boolean z4;
        C7155.m19727();
        InterfaceC8743 interfaceC8743NextToken = super.nextToken();
        if (interfaceC8743NextToken.getType() == -1) {
            return interfaceC8743NextToken;
        }
        if (interfaceC8743NextToken.mo23441() != 0) {
            boolean zM50934 = C22600.m50934(interfaceC8743NextToken.getText());
            if (zM50934) {
                this.f74691 = true;
            }
            if (!zM50934 || this.f74694.equals(".") || this.f74694.equals("?.")) {
                return interfaceC8743NextToken;
            }
            String str = this.f74689;
            str.getClass();
            switch (str) {
                case "return":
                case "continue":
                case "break":
                    break;
                case "yield":
                    C14612 c14612 = this.f74692;
                    if (c14612 != null && !c14612.m35256(interfaceC8743NextToken.mo23442())) {
                        return interfaceC8743NextToken;
                    }
                    break;
                default:
                    return interfaceC8743NextToken;
            }
            this.f74685 = true;
            this.f74683 = true;
            return interfaceC8743NextToken;
        }
        this.f74691 = false;
        String text = interfaceC8743NextToken.getText();
        if (interfaceC8743NextToken.getType() == 145) {
            return interfaceC8743NextToken;
        }
        ArrayDeque arrayDeque = this.f74696;
        C11080 c11080 = (C11080) arrayDeque.peek();
        boolean z5 = this.f74689.equals(".") || this.f74689.equals("?.");
        boolean z6 = (!text.equals("of") || c11080 == null || !c11080.f34937 || this.f74685 || z5 || (this.f74694.equals(MotionUtils.EASING_TYPE_FORMAT_START) && (this.f74689.equals("var") || this.f74689.equals("let") || this.f74689.equals("const")))) ? false : true;
        if (c11080 != null && (text.equals(l.b) || z6 || (text.equals("in") && !z5))) {
            c11080.f34937 = false;
        }
        if (text.equals("async")) {
            this.f74684 = this.f74683;
        }
        int type = interfaceC8743NextToken.getType();
        boolean z7 = z6;
        ArrayDeque arrayDeque2 = this.f74686;
        if (type == 144) {
            this.f74685 = true;
            this.f74683 = false;
            arrayDeque.push(new C11080(false, false));
        } else if (text.equals(MotionUtils.EASING_TYPE_FORMAT_START)) {
            if (!this.f74694.equals(".") && !this.f74694.equals("?.")) {
                String str2 = this.f74689;
                str2.getClass();
                switch (str2.hashCode()) {
                    case -889473228:
                        if (!str2.equals("switch")) {
                            b2 = -1;
                        } else {
                            b2 = 0;
                        }
                        break;
                    case 3357:
                        if (!str2.equals("if")) {
                            b2 = -1;
                        } else {
                            b2 = 1;
                        }
                        break;
                    case 101577:
                        if (!str2.equals("for")) {
                            b2 = -1;
                        } else {
                            b2 = 2;
                        }
                        break;
                    case 3649734:
                        if (!str2.equals("with")) {
                            b2 = -1;
                        } else {
                            b2 = 3;
                        }
                        break;
                    case 94432955:
                        if (!str2.equals("catch")) {
                            b2 = -1;
                        } else {
                            b2 = 4;
                        }
                        break;
                    case 113101617:
                        if (!str2.equals("while")) {
                            b2 = -1;
                        } else {
                            b2 = 5;
                        }
                        break;
                    default:
                        b2 = -1;
                        break;
                }
                switch (b2) {
                    default:
                        if (!this.f74689.equals("await") || !this.f74694.equals("for")) {
                            z2 = false;
                            break;
                        }
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        z2 = true;
                        break;
                }
            } else {
                z2 = false;
            }
            Boolean bool = this.f74693;
            arrayDeque.push(new C11080(z2, bool != null && bool.booleanValue()));
            ((C11080) arrayDeque.peek()).f34937 = z2 && (this.f74689.equals("for") || this.f74689.equals("await"));
            if (this.f74693 != null) {
                z3 = true;
                ((C11080) arrayDeque.peek()).f34939 = true;
                this.f74693 = null;
            } else {
                z3 = true;
            }
            this.f74685 = z3;
            this.f74683 = false;
        } else if (text.equals("[")) {
            arrayDeque.push(new C11080(false, false));
            this.f74685 = true;
            this.f74683 = false;
        } else {
            if (text.equals("{")) {
                C22269 c22269 = (C22269) arrayDeque2.peek();
                boolean z8 = c22269 != null && arrayDeque.size() == c22269.f72120;
                boolean z9 = this.f74683 || this.f74682 || this.f74689.equals(MotionUtils.EASING_TYPE_FORMAT_END) || this.f74689.equals("=>") || this.f74687 != null || z8;
                arrayDeque.push(new C11080(z9, Boolean.FALSE.equals(this.f74687) || (z8 && !c22269.f72119)));
                this.f74687 = null;
                if (z8) {
                    arrayDeque2.pop();
                }
                this.f74685 = true;
                this.f74683 = z9;
            } else {
                obj = "?.";
                if (text.equals(MotionUtils.EASING_TYPE_FORMAT_END) || text.equals("]") || text.equals(l.d)) {
                    obj2 = ".";
                    C11080 c11081 = arrayDeque.isEmpty() ? null : (C11080) arrayDeque.pop();
                    while (!arrayDeque2.isEmpty() && ((C22269) arrayDeque2.peek()).f72120 > arrayDeque.size()) {
                        arrayDeque2.pop();
                    }
                    this.f74682 = text.equals(MotionUtils.EASING_TYPE_FORMAT_END) && c11081 != null && c11081.f34936;
                    if (c11081 != null && c11081.f34939) {
                        this.f74687 = Boolean.valueOf(c11081.f34938);
                    }
                    boolean z10 = this.f74682 || (text.equals(l.d) && c11081 != null && c11081.f34936 && !c11081.f34938);
                    this.f74685 = z10;
                    this.f74683 = z10;
                } else {
                    obj2 = ".";
                    if (text.equals("function")) {
                        this.f74693 = Boolean.valueOf(this.f74683 || this.f74689.equals("export") || this.f74689.equals("default") || (this.f74689.equals("async") && this.f74684));
                        this.f74685 = true;
                        this.f74683 = false;
                    } else if (text.equals(Name.LABEL) && !z5) {
                        arrayDeque2.push(new C22269(arrayDeque.size(), this.f74683 || this.f74689.equals("export") || this.f74689.equals("default")));
                        this.f74685 = true;
                        this.f74683 = false;
                    } else if (text.equals(l.b)) {
                        this.f74685 = true;
                        this.f74683 = true;
                    } else {
                        switch (text.hashCode()) {
                            case -1335458389:
                                if (!text.equals("delete")) {
                                    b = -1;
                                } else {
                                    b = 0;
                                }
                                break;
                            case -934396624:
                                if (!text.equals("return")) {
                                    b = -1;
                                } else {
                                    b = 1;
                                }
                                break;
                            case -858802543:
                                if (!text.equals("typeof")) {
                                    b = -1;
                                } else {
                                    b = 2;
                                }
                                break;
                            case 33:
                                if (!text.equals("!")) {
                                    b = -1;
                                } else {
                                    b = 3;
                                }
                                break;
                            case 37:
                                if (!text.equals("%")) {
                                    b = -1;
                                } else {
                                    b = 4;
                                }
                                break;
                            case 38:
                                if (!text.equals(a.p)) {
                                    b = -1;
                                } else {
                                    b = 5;
                                }
                                break;
                            case 42:
                                if (!text.equals("*")) {
                                    b = -1;
                                } else {
                                    b = 6;
                                }
                                break;
                            case 43:
                                if (!text.equals(BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX)) {
                                    b = -1;
                                } else {
                                    b = 7;
                                }
                                break;
                            case 44:
                                if (!text.equals(",")) {
                                    b = -1;
                                } else {
                                    b = 8;
                                }
                                break;
                            case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                                if (!text.equals("-")) {
                                    b = -1;
                                } else {
                                    b = 9;
                                }
                                break;
                            case 47:
                                if (!text.equals("/")) {
                                    b = -1;
                                } else {
                                    b = 10;
                                }
                                break;
                            case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                                if (!text.equals(":")) {
                                    b = -1;
                                } else {
                                    b = 11;
                                }
                                break;
                            case 60:
                                if (!text.equals("<")) {
                                    b = -1;
                                } else {
                                    b = 12;
                                }
                                break;
                            case 61:
                                if (!text.equals("=")) {
                                    b = -1;
                                } else {
                                    b = cb.k;
                                }
                                break;
                            case 62:
                                if (!text.equals(">")) {
                                    b = -1;
                                } else {
                                    b = cb.f82047l;
                                }
                                break;
                            case 63:
                                if (!text.equals("?")) {
                                    b = -1;
                                } else {
                                    b = 15;
                                }
                                break;
                            case MaterialColors.TONE_SURFACE_CONTAINER_LIGHT /* 94 */:
                                if (!text.equals("^")) {
                                    b = -1;
                                } else {
                                    b = 16;
                                }
                                break;
                            case 124:
                                if (!text.equals("|")) {
                                    b = -1;
                                } else {
                                    b = 17;
                                }
                                break;
                            case 126:
                                if (!text.equals("~")) {
                                    b = -1;
                                } else {
                                    b = 18;
                                }
                                break;
                            case 1084:
                                if (!text.equals("!=")) {
                                    b = -1;
                                } else {
                                    b = 19;
                                }
                                break;
                            case 1208:
                                if (!text.equals("%=")) {
                                    b = -1;
                                } else {
                                    b = 20;
                                }
                                break;
                            case 1216:
                                if (!text.equals("&&")) {
                                    b = -1;
                                } else {
                                    b = 21;
                                }
                                break;
                            case 1239:
                                if (!text.equals("&=")) {
                                    b = -1;
                                } else {
                                    b = 22;
                                }
                                break;
                            case 1344:
                                if (!text.equals("**")) {
                                    b = -1;
                                } else {
                                    b = 23;
                                }
                                break;
                            case 1363:
                                if (!text.equals("*=")) {
                                    b = -1;
                                } else {
                                    b = 24;
                                }
                                break;
                            case 1394:
                                if (!text.equals("+=")) {
                                    b = -1;
                                } else {
                                    b = 25;
                                }
                                break;
                            case 1456:
                                if (!text.equals("-=")) {
                                    b = -1;
                                } else {
                                    b = 26;
                                }
                                break;
                            case 1518:
                                if (!text.equals("/=")) {
                                    b = -1;
                                } else {
                                    b = 27;
                                }
                                break;
                            case 1921:
                                if (!text.equals("<=")) {
                                    b = -1;
                                } else {
                                    b = ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB;
                                }
                                break;
                            case 1952:
                                if (!text.equals("==")) {
                                    b = -1;
                                } else {
                                    b = 29;
                                }
                                break;
                            case 1953:
                                if (!text.equals("=>")) {
                                    b = -1;
                                } else {
                                    b = 30;
                                }
                                break;
                            case 2016:
                                if (!text.equals("??")) {
                                    b = -1;
                                } else {
                                    b = bo.j;
                                }
                                break;
                            case 2975:
                                if (!text.equals("^=")) {
                                    b = -1;
                                } else {
                                    b = UTF8.S_CS3;
                                }
                                break;
                            case 3211:
                                if (!text.equals("do")) {
                                    b = -1;
                                } else {
                                    b = PublicSuffixDatabase.EXCEPTION_MARKER;
                                }
                                break;
                            case 3365:
                                if (!text.equals("in")) {
                                    b = -1;
                                } else {
                                    b = 34;
                                }
                                break;
                            case 3543:
                                if (!text.equals("of")) {
                                    b = -1;
                                } else {
                                    b = 35;
                                }
                                break;
                            case 3905:
                                if (!text.equals("|=")) {
                                    b = -1;
                                } else {
                                    b = 36;
                                }
                                break;
                            case 3968:
                                if (!text.equals("||")) {
                                    b = -1;
                                } else {
                                    b = 37;
                                }
                                break;
                            case 33665:
                                if (!text.equals("!==")) {
                                    b = -1;
                                } else {
                                    b = 38;
                                }
                                break;
                            case 37757:
                                if (!text.equals("&&=")) {
                                    b = -1;
                                } else {
                                    b = 39;
                                }
                                break;
                            case 41725:
                                if (!text.equals("**=")) {
                                    b = -1;
                                } else {
                                    b = 40;
                                }
                                break;
                            case 60573:
                                if (!text.equals("===")) {
                                    b = -1;
                                } else {
                                    b = 41;
                                }
                                break;
                            case 62557:
                                if (!text.equals("??=")) {
                                    b = -1;
                                } else {
                                    b = 42;
                                }
                                break;
                            case 108960:
                                if (!text.equals("new")) {
                                    b = -1;
                                } else {
                                    b = 43;
                                }
                                break;
                            case 123069:
                                if (!text.equals("||=")) {
                                    b = -1;
                                } else {
                                    b = 44;
                                }
                                break;
                            case 3046192:
                                if (!text.equals("case")) {
                                    b = -1;
                                } else {
                                    b = 45;
                                }
                                break;
                            case 3116345:
                                if (!text.equals("else")) {
                                    b = -1;
                                } else {
                                    b = 46;
                                }
                                break;
                            case 3625364:
                                if (!text.equals(ClassTransform.VOID)) {
                                    b = -1;
                                } else {
                                    b = 47;
                                }
                                break;
                            case 93223254:
                                if (!text.equals("await")) {
                                    b = -1;
                                } else {
                                    b = UTF8.S_P3A;
                                }
                                break;
                            case 110339814:
                                if (!text.equals("throw")) {
                                    b = -1;
                                } else {
                                    b = 49;
                                }
                                break;
                            case 114974605:
                                if (!text.equals("yield")) {
                                    b = -1;
                                } else {
                                    b = 50;
                                }
                                break;
                            case 902025516:
                                if (!text.equals("instanceof")) {
                                    b = -1;
                                } else {
                                    b = 51;
                                }
                                break;
                            default:
                                b = -1;
                                break;
                        }
                        switch (b) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                            case 46:
                            case 47:
                            case 49:
                            case 51:
                                z = true;
                                break;
                            case 35:
                                z = z7;
                                break;
                            case 48:
                                C14612 c14613 = this.f74692;
                                if (c14613 == null || c14613.m35254(interfaceC8743NextToken.mo23442())) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                break;
                            case 50:
                                C14612 c14614 = this.f74692;
                                if (c14614 == null || c14614.m35256(interfaceC8743NextToken.mo23442())) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                break;
                            default:
                                z = false;
                                break;
                        }
                        this.f74685 = z;
                        this.f74683 = text.equals("else") || text.equals("do") || text.equals("try") || text.equals("finally");
                    }
                }
            }
            if (!this.f74689.equals(obj2) || this.f74689.equals(obj)) {
                z4 = false;
                this.f74685 = false;
                this.f74683 = false;
                this.f74693 = null;
            } else {
                z4 = false;
            }
            if (!text.equals(MotionUtils.EASING_TYPE_FORMAT_END)) {
                this.f74682 = z4;
            }
            this.f74694 = this.f74689;
            this.f74689 = text;
            if (arrayDeque.size() <= 256 || arrayDeque2.size() > 256 || this.f74688.size() > 128) {
                throw new IllegalArgumentException("Source nesting exceeds formatter limit");
            }
            return interfaceC8743NextToken;
        }
        obj = "?.";
        obj2 = ".";
        if (this.f74689.equals(obj2)) {
            z4 = false;
            this.f74685 = false;
            this.f74683 = false;
            this.f74693 = null;
        } else {
            z4 = false;
            this.f74685 = false;
            this.f74683 = false;
            this.f74693 = null;
        }
        if (!text.equals(MotionUtils.EASING_TYPE_FORMAT_END)) {
            this.f74682 = z4;
        }
        this.f74694 = this.f74689;
        this.f74689 = text;
        if (arrayDeque.size() <= 256) {
        }
        throw new IllegalArgumentException("Source nesting exceeds formatter limit");
    }
}

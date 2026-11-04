package l;

import com.google.android.material.motion.MotionUtils;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: renamed from: l.ۢ᩶᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 643O */
/* JADX INFO: loaded from: classes4.dex */
public class C10377 extends AbstractC11781 implements InterfaceC1567 {

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public static final C5339 f33008 = new C5339(4);

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C8935 f33009;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C14769 f33010;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public AbstractC21654 f33011;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C14769 f33012;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C14769 f33013;

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public C10377 mo26686() {
        return this;
    }

    @Override // l.AbstractC11781
    public final String toString() {
        String string;
        if ((this.f38071 & 1048576) != 0) {
            return this.f38069.f38072.toString();
        }
        AbstractC19728 abstractC19728 = this.f38072;
        String string2 = abstractC19728 == abstractC19728.f63499.f73707.f49865 ? this.f38069.f38072.toString() : abstractC19728.toString();
        AbstractC22664 abstractC22664 = this.f38067;
        if (abstractC22664 == null) {
            return string2;
        }
        if (abstractC22664.m51067(EnumC21172.FORALL)) {
            string2 = "<" + ((C5291) this.f38067).f18620 + ">" + string2;
        }
        StringBuilder sbM10405 = C3188.m10405(string2, MotionUtils.EASING_TYPE_FORMAT_START);
        AbstractC22664 abstractC22665 = this.f38067;
        boolean z = (this.f38071 & 17179869184L) != 0;
        C14769 c14769Mo50621 = abstractC22665.mo50621();
        if (z) {
            StringBuilder sb = new StringBuilder();
            while (c14769Mo50621.f48336.m35550()) {
                sb.append(c14769Mo50621.f48335);
                c14769Mo50621 = c14769Mo50621.f48336;
                sb.append(',');
            }
            if (((AbstractC22664) c14769Mo50621.f48335).m51067(EnumC21172.ARRAY)) {
                sb.append(((C2832) c14769Mo50621.f48335).f9333);
                if (((AbstractC22664) c14769Mo50621.f48335).m51071().m35550()) {
                    sb.append(((AbstractC22664) c14769Mo50621.f48335).m51071());
                }
                sb.append("...");
            } else {
                sb.append(c14769Mo50621.f48335);
            }
            string = sb.toString();
        } else {
            string = c14769Mo50621.m35545(",");
        }
        return C8947.m23910(sbM10405, string, MotionUtils.EASING_TYPE_FORMAT_END);
    }

    @Override // l.AbstractC11781, l.InterfaceC12753
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Set mo26692() {
        long j = this.f38071;
        if ((8796093022208L & j) != 0) {
            j &= -1025;
        }
        return C2417.m8160(j);
    }

    @Override // l.InterfaceC1567
    /* JADX INFO: renamed from: ᩵ */
    public final boolean mo5574() {
        return (this.f38071 & 17179869184L) != 0;
    }

    @Override // l.InterfaceC1567
    /* JADX INFO: renamed from: ۛ */
    public C14769 mo5571() {
        return this.f38067.mo50622();
    }

    @Override // l.InterfaceC1567
    /* JADX INFO: renamed from: ۤ */
    public AbstractC22664 mo5572() {
        return this.f38067.mo31585();
    }

    @Override // l.AbstractC11781, l.InterfaceC12753
    /* JADX INFO: renamed from: ֫ */
    public InterfaceC12753 mo16951() {
        return this.f38069;
    }

    @Override // l.AbstractC11781, l.InterfaceC12753
    /* JADX INFO: renamed from: ᩹ */
    public AbstractC19728 mo9563() {
        return this.f38072;
    }

    @Override // l.AbstractC11781, l.InterfaceC12753
    /* JADX INFO: renamed from: ۧ */
    public /* bridge */ /* synthetic */ C14769 mo16957() {
        return mo16957();
    }

    public C10377(long j, AbstractC19728 abstractC19728, AbstractC22664 abstractC22664, AbstractC11781 abstractC11781) {
        super(EnumC13603.f43218, j, abstractC19728, abstractC22664, abstractC11781);
        this.f33009 = null;
        this.f33010 = C14769.m35543();
        this.f33012 = C14769.m35543();
        this.f33013 = null;
        this.f33011 = null;
        if (abstractC11781.f38067.m51067(EnumC21172.TYPEVAR)) {
            C11972.m30024(abstractC11781 + "." + ((Object) abstractC19728));
            throw null;
        }
    }

    @Override // l.AbstractC11781
    /* JADX INFO: renamed from: ᩷ */
    public AbstractC11781 mo16960(AbstractC11781 abstractC11781) {
        C19328 c19328 = new C19328(this, this.f38071, this.f38072, this.f38067, abstractC11781, abstractC11781);
        c19328.f33009 = this.f33009;
        return c19328;
    }

    @Override // l.AbstractC11781, l.InterfaceC13564
    /* JADX INFO: renamed from: ܶ */
    public int mo2973() {
        return this.f38069.m29587() ? 11 : 10;
    }

    /* JADX INFO: renamed from: ᩶ۙ */
    public C8141 mo22021() {
        return new C8141(this, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10377 m26688(C24550 c24550, C24705 c24705) {
        AbstractC22970 abstractC22970 = c24550;
        while (abstractC22970 != null) {
            for (AbstractC11781 abstractC11781 : abstractC22970.mo29571().m38842(this.f38072)) {
                EnumC13603 enumC13603 = abstractC11781.f38066;
                EnumC13603 enumC13604 = EnumC13603.f43218;
                if (enumC13603 == enumC13604) {
                    C10377 c10377 = (C10377) abstractC11781;
                    if (!c10377.m29570() && this.f38066 == enumC13604) {
                        if (c10377 != this) {
                            if (m26685((AbstractC22970) c10377.f38069)) {
                                if (c24705.m55157(this.f38069, c10377.f38069.f38067) == null || !c24705.m55149(c10377.mo29576(c24705), mo29576(c24705))) {
                                }
                            }
                            if ((c10377.f38071 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) != 0 || !m26685((AbstractC22970) c24550) || !c10377.m29567((AbstractC22970) c24550, c24705) || !c24705.m55149(c10377.mo29576(c24705), mo29576(c24705))) {
                            }
                        }
                        return c10377;
                    }
                }
            }
            abstractC22970 = c24705.m55137(abstractC22970.f38067).f73596;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0057  */
    /* JADX WARN: Code duplicated, block: B:26:0x005e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0087 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x0089  */
    /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    @Override // l.AbstractC11781
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo26689(AbstractC11781 abstractC11781, AbstractC22970 abstractC22970, C24705 c24705, boolean z) {
        long j;
        AbstractC22664 abstractC22664M55126;
        AbstractC22664 abstractC22664M55127;
        C1083 c1083;
        C14769 c14769Mo15882;
        if (m29570() || abstractC11781.f38066 != EnumC13603.f43218) {
            return false;
        }
        if (this != abstractC11781) {
            C10377 c10377 = (C10377) abstractC11781;
            if (c10377.m26685((AbstractC22970) this.f38069)) {
                if (c24705.m55157(c10377.f38069, this.f38069.f38067) != null) {
                    AbstractC22664 abstractC22664M55128 = c24705.m55126(this, this.f38069.f38067);
                    AbstractC22664 abstractC22664M55129 = c24705.m55126(c10377, this.f38069.f38067);
                    if (!c24705.m55165(abstractC22664M55128, abstractC22664M55129, true) || (z && !c24705.m55086(abstractC22664M55128, abstractC22664M55129))) {
                        if ((this.f38071 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) != 0) {
                            return false;
                        }
                        j = c10377.f38071;
                        if (((ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS & j) != 0 && (j & 8796093022208L) == 0) || !c10377.m26685(abstractC22970) || !m29567(abstractC22970, c24705)) {
                            return false;
                        }
                        abstractC22664M55126 = c24705.m55126(this, abstractC22970.f38067);
                        abstractC22664M55127 = c24705.m55126(c10377, abstractC22970.f38067);
                        if (!c24705.m55165(abstractC22664M55126, abstractC22664M55127, true)) {
                            return false;
                        }
                        if (z) {
                            c1083 = c24705.f79958;
                            c14769Mo15882 = abstractC22664M55126.mo15882();
                            if (!c24705.m55116(abstractC22664M55126.mo31585(), c24705.m55103(abstractC22664M55127.mo31585(), abstractC22664M55127.mo15882(), c14769Mo15882), c1083)) {
                                return false;
                            }
                        }
                    }
                } else {
                    if ((this.f38071 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) != 0) {
                        return false;
                    }
                    j = c10377.f38071;
                    if ((ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS & j) != 0) {
                    }
                    abstractC22664M55126 = c24705.m55126(this, abstractC22970.f38067);
                    abstractC22664M55127 = c24705.m55126(c10377, abstractC22970.f38067);
                    if (!c24705.m55165(abstractC22664M55126, abstractC22664M55127, true)) {
                        return false;
                    }
                    if (z) {
                        c1083 = c24705.f79958;
                        c14769Mo15882 = abstractC22664M55126.mo15882();
                        if (!c24705.m55116(abstractC22664M55126.mo31585(), c24705.m55103(abstractC22664M55127.mo31585(), abstractC22664M55127.mo15882(), c14769Mo15882), c1083)) {
                            return false;
                        }
                    }
                }
            } else {
                if ((this.f38071 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) != 0) {
                    return false;
                }
                j = c10377.f38071;
                if ((ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS & j) != 0) {
                }
                abstractC22664M55126 = c24705.m55126(this, abstractC22970.f38067);
                abstractC22664M55127 = c24705.m55126(c10377, abstractC22970.f38067);
                if (!c24705.m55165(abstractC22664M55126, abstractC22664M55127, true)) {
                    return false;
                }
                if (z) {
                    c1083 = c24705.f79958;
                    c14769Mo15882 = abstractC22664M55126.mo15882();
                    if (!c24705.m55116(abstractC22664M55126.mo31585(), c24705.m55103(abstractC22664M55127.mo31585(), abstractC22664M55127.mo15882(), c14769Mo15882), c1083)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m26685(AbstractC22970 abstractC22970) {
        int i = (int) (this.f38071 & 7);
        if (i == 0) {
            return m29564() == abstractC22970.m29564() && (abstractC22970.mo29591() & 512) == 0;
        }
        if (i != 1) {
            return i == 4 && (abstractC22970.mo29591() & 512) == 0;
        }
        return !this.f38069.m29587() || (this.f38071 & 8) == 0;
    }

    @Override // l.AbstractC11781
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo26690(AbstractC11781 abstractC11781, C24705 c24705) {
        if (((int) (this.f38071 & 7)) != 1) {
            return super.mo26690(abstractC11781, c24705);
        }
        return !this.f38069.m29587() || abstractC11781 == this.f38069 || (this.f38071 & 8) == 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10377 m26687(AbstractC22970 abstractC22970, C24705 c24705, boolean z) {
        C10377 c10377M55090 = c24705.m55090(this, abstractC22970, z, f33008);
        if (c10377M55090 != null) {
            return c10377M55090;
        }
        if (!c24705.m55171(abstractC22970.f38067) || abstractC22970.m29587()) {
            return null;
        }
        return m26687(c24705.m55137(abstractC22970.f38067).f73596, c24705, z);
    }

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public final C14769 m26691() {
        this.f38069.mo29590();
        if (this.f33013 == null) {
            C18499 c18499 = new C18499();
            Iterator it = this.f38067.mo50621().iterator();
            int i = 0;
            while (it.hasNext()) {
                c18499.m43089(new C5816(8589934592L, this.f38072.f63499.m51194("arg" + i), (AbstractC22664) it.next(), this));
                i++;
            }
            this.f33013 = c18499.m43093();
        }
        C11972.m30021(this.f33013);
        return this.f33013;
    }

    @Override // l.AbstractC11781
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC11781 mo16954(AbstractC22664 abstractC22664, C24705 c24705) {
        return new C10377(this.f38071, this.f38072, c24705.m55126(this, abstractC22664), this.f38069);
    }

    @Override // l.AbstractC11781, l.InterfaceC12753
    /* JADX INFO: renamed from: ۙ */
    public final EnumC5296 mo9558() {
        AbstractC19728 abstractC19728 = this.f38072;
        C15252 c15252 = abstractC19728.f63499.f73707;
        if (abstractC19728 == c15252.f49865) {
            return EnumC5296.CONSTRUCTOR;
        }
        if (abstractC19728 == c15252.f49758) {
            return EnumC5296.STATIC_INIT;
        }
        if ((this.f38071 & 1048576) != 0) {
            return mo7874() ? EnumC5296.STATIC_INIT : EnumC5296.INSTANCE_INIT;
        }
        return EnumC5296.METHOD;
    }

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public final boolean m26693() {
        return mo9558() == EnumC5296.STATIC_INIT || mo9558() == EnumC5296.INSTANCE_INIT;
    }

    @Override // l.InterfaceC1567
    /* JADX INFO: renamed from: ᩴ */
    public AbstractC21654 mo5573() {
        return this.f33011;
    }

    @Override // l.InterfaceC1567
    public C14769 getParameters() {
        return m26691();
    }

    @Override // l.InterfaceC12753
    /* JADX INFO: renamed from: ۙ */
    public final Object mo7871(AbstractC9024 abstractC9024, Object obj) {
        return abstractC9024.mo24076(this, obj);
    }

    @Override // l.AbstractC11781
    /* JADX INFO: renamed from: ۙ */
    public Object mo16953(InterfaceC2087 interfaceC2087, Locale locale) {
        return interfaceC2087.mo7179(this, (Object) locale);
    }
}

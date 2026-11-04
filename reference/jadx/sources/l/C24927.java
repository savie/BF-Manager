package l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.function.Consumer;
import java.util.function.Predicate;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: l.᩻ۡۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: W2ZV */
/* JADX INFO: loaded from: classes2.dex */
public final class C24927 extends AbstractC12531 implements Comparable {

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f80672 = C16980.m40037(C24927.class);

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public List f80673;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public volatile EnumC7026 f80674;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public List f80675;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public String f80676;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final C1610 f80677;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public List f80678;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C10293 f80679;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public List f80680;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public List f80681;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C1345 f80682;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public C18807 f80683;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public AbstractC1566 f80684;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public C24927 f80685;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public List f80686;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public C8517 f80687;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public List f80688;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10161 f80689;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public Map f80690;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public List f80691;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public List f80692;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public List f80693;

    /* JADX INFO: renamed from: ۧ᩷, reason: not valid java name and contains not printable characters */
    private synchronized InterfaceC23283 m55529() {
        if (m55552()) {
            return InterfaceC23283.f75440;
        }
        C22842 c22842M5682 = this.f80677.m5682();
        String strM4966 = this.f80682.m4966();
        InterfaceC23283 interfaceC23283M51544 = c22842M5682.m51544(strM4966);
        C19858 c19858 = InterfaceC23283.f75440;
        if (interfaceC23283M51544 != c19858) {
            return interfaceC23283M51544;
        }
        InterfaceC23283 interfaceC23283M55531 = m55531();
        if (interfaceC23283M55531 != c19858) {
            c22842M5682.m51545(strM4966, interfaceC23283M55531);
        }
        return interfaceC23283M55531;
    }

    @Override // l.InterfaceC24181
    public final String typeName() {
        return Name.LABEL;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f80682.compareTo(((C24927) obj).f80682);
    }

    public C24927(C1610 c1610, InterfaceC10161 interfaceC10161) {
        List list = Collections.EMPTY_LIST;
        this.f80680 = list;
        this.f80686 = list;
        this.f80678 = list;
        this.f80685 = this;
        this.f80674 = EnumC7026.NOT_LOADED;
        EnumC10008 enumC10008 = EnumC10008.NONE;
        this.f80681 = list;
        this.f80673 = list;
        this.f80693 = list;
        this.f80688 = list;
        this.f80690 = Collections.EMPTY_MAP;
        this.f80677 = c1610;
        C1345 c1345M4955 = C1345.m4955(c1610, AbstractC1566.m5538(interfaceC10161.getType()));
        this.f80682 = c1345M4955;
        this.f80687 = C8517.m22833(c1610, c1345M4955.m4963(), this);
        C11733 c11733Copy = interfaceC10161.copy();
        this.f80689 = c11733Copy;
        m55525((InterfaceC10161) c11733Copy, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m55525(InterfaceC10161 interfaceC10161, boolean z) {
        C1345 c1345 = this.f80682;
        try {
            m39411((List) interfaceC10161.getAttributes());
            this.f80679 = new C10293(interfaceC10161.mo26275(), EnumC19244.CLASS);
            this.f80684 = m55523(interfaceC10161);
            this.f80691 = C4123.m13226(interfaceC10161.mo26276(), new C19705(0));
            this.f80676 = interfaceC10161.mo26274();
            C9613 c9613 = new C9613(new C15229(0, this));
            C9613 c9614 = new C9613(new C15309(2, this));
            interfaceC10161.mo26273(c9613, c9614);
            this.f80675 = c9613.m25100();
            this.f80692 = c9614.m25100();
            if (z) {
                C1610 c1610 = this.f80677;
                InterfaceC24444 interfaceC24444M13733 = c1610.m5681().m17719().m13733(c1610);
                if (interfaceC24444M13733 != null) {
                    ((C23341) interfaceC24444M13733).m52509(this);
                } else {
                    f80672.mo13728(this, "Can't restore usage data for class: {}");
                }
            }
            List<C17467> list = this.f80675;
            if (!list.isEmpty()) {
                for (C17467 c17467 : list) {
                    C10293 c10293Mo8547 = c17467.mo8547();
                    if (c10293Mo8547.m26540() && c10293Mo8547.m26538() && c17467.mo17862(C25278.f81643) == null) {
                        c17467.mo17864(C15580.f50679);
                    }
                }
            }
            m55530(this);
            if (c1345.m4971().equals("package-info") && this.f80675.isEmpty() && this.f80692.isEmpty()) {
                mo17866(EnumC1763.PACKAGE_INFO);
            }
            this.f80690 = new HashMap(this.f80692.size());
            for (C2551 c2551 : this.f80692) {
                this.f80690.put(c2551.mo8532(), c2551);
            }
            if (this.f80679.m26527()) {
                m31138("Modules not supported yet");
            }
        } catch (Exception e) {
            throw new C8597("Error decode class: " + c1345, e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AbstractC1566 m55523(InterfaceC10161 interfaceC10161) {
        String strMo26272 = interfaceC10161.mo26272();
        if (strMo26272 == null) {
            C1345 c1345 = this.f80682;
            if (c1345.getType().mo5570().equals("java.lang.Object") || this.f80679.m26527()) {
                return null;
            }
            throw new C8597("No super class in " + c1345.getType());
        }
        return AbstractC1566.m5538(strMo26272);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55540(List list, AbstractC1566 abstractC1566, List list2) {
        this.f80680 = list;
        this.f80684 = abstractC1566;
        this.f80691 = list2;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00cf  */
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static void m55530(C24927 c24927) {
        C25278 c25278 = C25278.f81644;
        C16326 c16326 = (C16326) c24927.mo17862(c25278);
        if (c16326 != null) {
            c24927.m39419(c25278);
            for (Map.Entry entry : c16326.m38747().entrySet()) {
                C2551 c2551M55563 = c24927.m55563((String) entry.getKey());
                if (c2551M55563 != null) {
                    c2551M55563.mo17864(new C17818((C15580) entry.getValue()));
                } else {
                    c24927.m31138("Method from annotation default annotation not found: " + ((String) entry.getKey()));
                }
            }
        }
        C1345 c1345 = c24927.f80682;
        C25278 c25279 = C25278.f81640;
        C21548 c21548 = (C21548) c24927.mo17862(c25279);
        if (c21548 == null) {
            return;
        }
        String strM48986 = c21548.m48986();
        if (strM48986.endsWith(".java")) {
            strM48986 = C1402.m5124(5, 0, strM48986);
        }
        if (!strM48986.isEmpty() && !strM48986.equals("SourceFile")) {
            if (c1345 == null) {
                return;
            }
            String strM4971 = c1345.m4971();
            if (!strM48986.equals(strM4971)) {
                for (C1345 c1345M4973 = c1345.m4973(); c1345M4973 != null; c1345M4973 = c1345M4973.m4973()) {
                    String strM4972 = c1345M4973.m4971();
                    if (!strM4972.equals(strM48986) && !strM4972.startsWith(strM48986.concat("$"))) {
                    }
                }
                if (!strM48986.contains("$")) {
                    if (strM4971.contains("$")) {
                        return;
                    } else {
                        return;
                    }
                }
                if (!strM48986.endsWith("$" + strM4971)) {
                    if (strM4971.contains("$") || !strM4971.startsWith(strM48986)) {
                        return;
                    }
                }
            }
        }
        c24927.m39419(c25279);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C24927 m55524(C1610 c1610, String str, int i) {
        C1345 c1345M4954 = C1345.m4954(c1610, str);
        if (c1610.m5671(c1345M4954) != null) {
            throw new C8597("Class already exist: ".concat(str));
        }
        C24927 c24927 = new C24927(c1610, c1345M4954, i);
        c24927.mo17866(EnumC1763.SYNTHETIC);
        c24927.f80676 = "synthetic";
        c24927.f80674 = EnumC7026.PROCESS_COMPLETE;
        c1610.m5676(c24927);
        return c24927;
    }

    public C24927(C1610 c1610, C1345 c1345, int i) {
        List list = Collections.EMPTY_LIST;
        this.f80680 = list;
        this.f80686 = list;
        this.f80678 = list;
        this.f80685 = this;
        this.f80674 = EnumC7026.NOT_LOADED;
        EnumC10008 enumC10008 = EnumC10008.NONE;
        this.f80681 = list;
        this.f80673 = list;
        this.f80693 = list;
        this.f80688 = list;
        this.f80690 = Collections.EMPTY_MAP;
        this.f80677 = c1610;
        this.f80689 = null;
        this.f80682 = c1345;
        this.f80691 = new ArrayList();
        this.f80692 = new ArrayList();
        this.f80675 = new ArrayList();
        this.f80679 = new C10293(i, EnumC19244.CLASS);
        this.f80687 = C8517.m22833(c1610, c1345.m4963(), this);
    }

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final void m55578() {
        if (m55556().f80674.m19341()) {
            return;
        }
        C24927 c24927M55556 = m55556();
        throw new C8597("Expected class to be processed at this point, class: " + c24927M55556 + ", state: " + c24927M55556.f80674);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final InterfaceC23283 m55551() {
        return m55529();
    }

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC23283 m55548() {
        return m55529();
    }

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final void m55547() {
        InterfaceC10161 interfaceC10161 = this.f80689;
        if (interfaceC10161 == null) {
            return;
        }
        m39415();
        m55549();
        this.f80677.m5688().m20020(this);
        m55525(interfaceC10161, true);
        C4937.forEach(this.f80686, new C22689(0));
    }

    /* JADX INFO: renamed from: ᩻᩷, reason: not valid java name and contains not printable characters */
    private InterfaceC23283 m55531() {
        try {
            InterfaceC23283 interfaceC23283M4868 = this.f80677.m5694().m4868(this);
            m55526(interfaceC23283M4868);
            return interfaceC23283M4868;
        } catch (Exception | StackOverflowError e) {
            C23977.m53506(this, "Code generation failed", e);
            return new C19858("/* ERROR: Code generation failed: " + C4123.m13224(e).replace("*/", "* /") + " */");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m55526(InterfaceC23283 interfaceC23283) {
        NavigableMap navigableMapM18212 = interfaceC23283.mo45711().m18212();
        if (navigableMapM18212.isEmpty()) {
            return;
        }
        for (Map.Entry entry : navigableMapM18212.entrySet()) {
            InterfaceC11653 interfaceC11653 = (InterfaceC11653) entry.getValue();
            if (interfaceC11653.mo8493() == EnumC1959.DECLARATION) {
                ((C16128) interfaceC11653).m38287().mo11265(((Integer) entry.getKey()).intValue());
            }
        }
        C1170.removeIf(navigableMapM18212.values(), new C10754(0));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m55527(InterfaceC11653 interfaceC11653) {
        if (interfaceC11653.mo8493() != EnumC1959.VAR_REF) {
            return false;
        }
        AbstractC12399 abstractC12399 = (AbstractC12399) interfaceC11653;
        if (abstractC12399.mo30871() != 0) {
            return false;
        }
        InterfaceC25186 interfaceC25186 = f80672;
        if (!interfaceC25186.mo13707()) {
            return true;
        }
        interfaceC25186.mo13716(abstractC12399, "Var reference '{}' incorrect (ref pos is zero) and was removed from metadata");
        return true;
    }

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public final void m55572() {
        C17467 c17467;
        C4000 c4000 = (C4000) mo17862((InterfaceC2157) C11457.f36004);
        boolean z = (c4000 == null || C8314.m22398(this).m37753()) ? false : true;
        if (z) {
            mo17866(EnumC1763.DONT_GENERATE);
            if (c4000.m12937() == EnumC24138.INSTANCE_FIELD && (c17467 = (C17467) C6823.m19007(this.f80675, new Predicate() { // from class: l.ۧۡۗ
                @Override // java.util.function.Predicate
                public /* synthetic */ Predicate and(Predicate predicate) {
                    return C19025.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* JADX INFO: renamed from: negate */
                public /* synthetic */ Predicate mo7134negate() {
                    return C19025.$default$negate(this);
                }

                public /* synthetic */ Predicate or(Predicate predicate) {
                    return C19025.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return C24927.m55528(this.f36201, (C17467) obj);
                }
            })) != null) {
                c17467.mo17866(EnumC1763.INLINE_INSTANCE_FIELD);
            }
        }
        for (C2551 c2551 : this.f80692) {
            try {
                c2551.m8531();
            } catch (Exception e) {
                c2551.getClass();
                C23977.m53506(c2551, "Method load error", e);
            }
            if (z && c2551.m8529()) {
                c2551.mo17866(EnumC1763.ANONYMOUS_CONSTRUCTOR);
            }
        }
        Iterator it = this.f80686.iterator();
        while (it.hasNext()) {
            ((C24927) it.next()).m55572();
        }
        this.f80674 = EnumC7026.LOADED;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m55528(C24927 c24927, C17467 c17467) {
        return c17467.mo8547().m26542() && c17467.mo8547().m26540() && c17467.mo8547().m26538() && c17467.mo13008().m34149().equals(c24927.f80682.getType());
    }

    /* JADX INFO: renamed from: ۚ᩷, reason: not valid java name and contains not printable characters */
    public final void m55549() {
        EnumC7026 enumC7026 = this.f80674;
        EnumC7026 enumC7027 = EnumC7026.NOT_LOADED;
        if (enumC7026 == enumC7027) {
            return;
        }
        synchronized (this.f80682) {
            int i = 0;
            C4937.forEach(this.f80692, new C12992(i));
            C4937.forEach(this.f80686, new C5535());
            C4937.forEach(this.f80675, new C1806(i));
            m39416();
            this.f80674 = enumC7027;
            EnumC10008 enumC10008 = EnumC10008.NONE;
        }
    }

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC1566 m55553() {
        return this.f80684;
    }

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public final List m55564() {
        return this.f80691;
    }

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final List m55566() {
        return this.f80680;
    }

    public final AbstractC1566 getType() {
        AbstractC1566 type = this.f80682.getType();
        return C4123.m13232((Collection) this.f80680) ? AbstractC1566.m5529(type, this.f80680) : type;
    }

    public final List getMethods() {
        return this.f80692;
    }

    public final List getFields() {
        return this.f80675;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55544(C17467 c17467) {
        List list = this.f80675;
        if (list == null || list.isEmpty()) {
            this.f80675 = new ArrayList(1);
        }
        this.f80675.add(c17467);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17467 m55538(C14022 c14022) {
        for (C17467 c17467 : this.f80675) {
            if (c17467.mo13008().equals(c14022)) {
                return c17467;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C17467 m55575(C14022 c14022) {
        for (C17467 c17467 : this.f80675) {
            if (c17467.mo13008().m34146(c14022)) {
                return c17467;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2551 m55535(C21965 c21965) {
        return (C2551) this.f80690.get(c21965);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C2551 m55570(String str) {
        for (C2551 c2551 : this.f80692) {
            if (c2551.mo8532().m49701().equals(str)) {
                return c2551;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C2551 m55563(String str) {
        for (C2551 c2551 : this.f80692) {
            if (c2551.mo8532().getName().equals(str)) {
                return c2551;
            }
        }
        return null;
    }

    @Override // l.InterfaceC20451
    public final C24927 getDeclaringClass() {
        if (m55552()) {
            return this.f80685;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55541(Consumer consumer) {
        C24927 c24927 = this;
        for (C24927 c24928 = this.f80685; c24928 != c24927; c24928 = c24928.f80685) {
            consumer.n(c24928);
            c24927 = c24928;
        }
    }

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public final C24927 m55556() {
        C24927 c24927 = this.f80685;
        return c24927 == this ? this : c24927.m55556();
    }

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public final C24927 m55574() {
        return this.f80685;
    }

    /* JADX INFO: renamed from: ܳ᩷, reason: not valid java name and contains not printable characters */
    public final void m55565() {
        this.f80682.m4960(this.f80677);
        this.f80685 = this;
    }

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final C8517 m55562() {
        return this.f80687;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55543(C15779 c15779) {
        C3101 c3101M5692 = this.f80677.m5692();
        Object type = getType();
        if (!this.f80684.equals(AbstractC1566.f5426)) {
            c15779.accept(type, this.f80684);
            c3101M5692.m10107(this.f80684, c15779);
        }
        for (AbstractC1566 abstractC1566 : this.f80691) {
            c15779.accept(type, abstractC1566);
            c3101M5692.m10107(abstractC1566, c15779);
        }
    }

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public final List m55534() {
        return this.f80686;
    }

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final List m55582() {
        return this.f80678;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m55558(C24927 c24927) {
        if (this.f80686.isEmpty()) {
            this.f80686 = new ArrayList(5);
        }
        this.f80686.add(c24927);
        c24927.f80685 = this;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m55577(C24927 c24927) {
        if (this.f80678.isEmpty()) {
            this.f80678 = new ArrayList(5);
        }
        c24927.mo17864(new C11039(this));
        this.f80678.add(c24927);
    }

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public final boolean m55552() {
        return this.f80685 != this;
    }

    /* JADX INFO: renamed from: ᩷᩷, reason: not valid java name and contains not printable characters */
    public final boolean m55579() {
        return this.f80685 == this;
    }

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public final C2551 m55584() {
        for (C2551 c2551 : this.f80692) {
            if (c2551.m8509()) {
                return c2551;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m55554() {
        AbstractC1566 abstractC1566;
        return this.f80679.m26539() && (abstractC1566 = this.f80684) != null && abstractC1566.mo5570().equals(AbstractC1566.f5414.mo5570());
    }

    @Override // l.InterfaceC20451
    /* JADX INFO: renamed from: ᩷ */
    public final C10293 mo8547() {
        return this.f80679;
    }

    @Override // l.InterfaceC20451
    /* JADX INFO: renamed from: ۙ */
    public final void mo8501(C10293 c10293) {
        this.f80679 = c10293;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4043 m55536(Object obj, boolean z) {
        return this.f80677.m5688().m20017(this, obj, z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4043 m55537(C23195 c23195) {
        return this.f80677.m5688().m20018(this, c23195);
    }

    @Override // l.InterfaceC24181
    /* JADX INFO: renamed from: ܰ */
    public final C1610 mo8527() {
        return this.f80677;
    }

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public final String m55569() {
        return this.f80682.m4966();
    }

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final C1345 m55571() {
        return this.f80682;
    }

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final String m55559() {
        return this.f80682.m4965();
    }

    @Deprecated
    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public final String m55532() {
        return this.f80682.m4965();
    }

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public final String m55568() {
        return this.f80682.m4959();
    }

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public final String m55583() {
        return this.f80682.m4967();
    }

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10161 m55561() {
        return this.f80689;
    }

    public final EnumC7026 getState() {
        return this.f80674;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55542(EnumC7026 enumC7026) {
        this.f80674 = enumC7026;
    }

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public final List m55567() {
        return this.f80681;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m55576(List list) {
        this.f80681 = list;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m55581(C24927 c24927) {
        List list = this.f80681;
        if (list != null && !list.isEmpty() && list.remove(c24927) && list.isEmpty()) {
            list = Collections.EMPTY_LIST;
        }
        this.f80681 = list;
    }

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public final List m55560() {
        return this.f80673;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55539(ArrayList arrayList) {
        this.f80673 = arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55546(C24927 c24927) {
        if (this.f80673.contains(c24927)) {
            return;
        }
        this.f80673 = C6823.m19001(this.f80673, (AbstractC12531) c24927);
    }

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public final List m55533() {
        return this.f80693;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m55557(List list) {
        this.f80693 = list;
    }

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public final List m55555() {
        return this.f80688;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m55580(List list) {
        this.f80688 = list;
    }

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final String m55573() {
        return this.f80676;
    }

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public final C18807 m55550() {
        return this.f80683;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55545(C18807 c18807) {
        this.f80683 = c18807;
    }

    @Override // l.InterfaceC11653
    /* JADX INFO: renamed from: ۘ */
    public final EnumC1959 mo8493() {
        return EnumC1959.CLASS;
    }

    public final int hashCode() {
        return this.f80682.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C24927) {
            return this.f80682.equals(((C24927) obj).f80682);
        }
        return false;
    }

    public final String toString() {
        return this.f80682.m4957();
    }
}

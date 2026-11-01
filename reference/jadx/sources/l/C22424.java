package l;

/* JADX INFO: renamed from: l.᩹ܿۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7UL */
/* JADX INFO: loaded from: classes.dex */
public final class C22424 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f73183;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4784 f73184;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4784 f73185;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f73186 = 0;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f73182 = false;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f73187 = false;

    public C22424(InterfaceC4784 interfaceC4784, InterfaceC4784 interfaceC4785, int i) {
        this.f73185 = interfaceC4784;
        this.f73183 = i;
        this.f73184 = interfaceC4785;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m49757() {
        return this.f73184 != null;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m49788() {
        int i;
        C2023.m6510(!m49790());
        if (m49752(this.f73185)) {
            i = 3;
        } else {
            InterfaceC4784 interfaceC4784 = this.f73184;
            i = (interfaceC4784 == null || interfaceC4784.getState() == 0) ? 2 : 4;
        }
        this.f73186 = i;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m49778(C5345 c5345) {
        int i = this.f73186;
        return ((i == 2 || i == 4) && m49754(c5345) == this.f73185) || (this.f73186 == 3 && m49754(c5345) == this.f73184);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m49790() {
        int i = this.f73186;
        return i == 2 || i == 4 || i == 3;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m49783() {
        boolean zM49752 = m49752(this.f73185);
        InterfaceC4784 interfaceC4784 = this.f73184;
        return (zM49752 ? 1 : 0) + ((interfaceC4784 == null || !m49752(interfaceC4784)) ? 0 : 1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49763(float f) {
        InterfaceC4784 interfaceC4784 = this.f73185;
        if (interfaceC4784.mo13272() != 1) {
            return;
        }
        interfaceC4784.mo13941(2, Float.valueOf(f));
        InterfaceC4784 interfaceC4785 = this.f73184;
        if (interfaceC4785 != null) {
            interfaceC4785.mo13941(2, Float.valueOf(f));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49766(Object obj) {
        InterfaceC4784 interfaceC4784 = this.f73185;
        if (interfaceC4784.mo13272() != 2) {
            return;
        }
        int i = this.f73186;
        if (i == 4 || i == 1) {
            InterfaceC4784 interfaceC4785 = this.f73184;
            interfaceC4785.getClass();
            interfaceC4785.mo13941(1, obj);
            return;
        }
        interfaceC4784.mo13941(1, obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49775(InterfaceC19841 interfaceC19841) {
        InterfaceC4784 interfaceC4784 = this.f73185;
        if (interfaceC4784.mo13272() != 2) {
            return;
        }
        interfaceC4784.mo13941(7, interfaceC19841);
        InterfaceC4784 interfaceC4785 = this.f73184;
        if (interfaceC4785 != null) {
            interfaceC4785.mo13941(7, interfaceC19841);
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m49780() {
        return this.f73185.mo13272();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long m49784(C5345 c5345) {
        InterfaceC4784 interfaceC4784M49754 = m49754(c5345);
        C13638.requireNonNull(interfaceC4784M49754);
        return interfaceC4784M49754.mo13271();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m49758(C5345 c5345) {
        InterfaceC4784 interfaceC4784M49754 = m49754(c5345);
        interfaceC4784M49754.getClass();
        return interfaceC4784M49754.mo13253();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m49786(C5345 c5345, long j) {
        InterfaceC4784 interfaceC4784M49754 = m49754(c5345);
        interfaceC4784M49754.getClass();
        m49749(interfaceC4784M49754, j);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49772(C10087 c10087, C10087 c10088, long j) {
        int i;
        int i2 = this.f73183;
        boolean zM25496 = c10087.m25496(i2);
        boolean zM25497 = c10088.m25496(i2);
        InterfaceC4784 interfaceC4784 = this.f73185;
        InterfaceC4784 interfaceC4785 = this.f73184;
        if (interfaceC4785 == null || (i = this.f73186) == 3 || (i == 0 && m49752(interfaceC4784))) {
            interfaceC4785 = interfaceC4784;
        }
        if (!zM25496 || interfaceC4785.mo13269()) {
            return;
        }
        boolean z = interfaceC4784.mo13272() == -2;
        C5490 c5490 = c10087.f34443[i2];
        C5490 c5491 = c10088.f34443[i2];
        if (!zM25497 || !C13638.equals(c5491, c5490) || z || m49790()) {
            m49749(interfaceC4785, j);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49765(long j) {
        int i;
        InterfaceC4784 interfaceC4784 = this.f73185;
        if (m49752(interfaceC4784) && (i = this.f73186) != 4 && i != 2) {
            m49749(interfaceC4784, j);
        }
        InterfaceC4784 interfaceC4785 = this.f73184;
        if (interfaceC4785 == null || interfaceC4785.getState() == 0 || this.f73186 == 3) {
            return;
        }
        m49749(interfaceC4785, j);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49749(InterfaceC4784 interfaceC4784, long j) {
        interfaceC4784.mo13255();
        if (interfaceC4784 instanceof C14943) {
            ((C14943) interfaceC4784).m35692(j);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m49761(long j, long j2) {
        InterfaceC4784 interfaceC4784 = this.f73185;
        long jMo13267 = m49752(interfaceC4784) ? interfaceC4784.mo13267(j, j2) : C17492.FOREVER_NS;
        InterfaceC4784 interfaceC4785 = this.f73184;
        return (interfaceC4785 == null || interfaceC4785.getState() == 0) ? jMo13267 : Math.min(jMo13267, interfaceC4785.mo13267(j, j2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49762() {
        InterfaceC4784 interfaceC4784 = this.f73185;
        if (m49752(interfaceC4784)) {
            interfaceC4784.mo13266();
            return;
        }
        InterfaceC4784 interfaceC4785 = this.f73184;
        if (interfaceC4785 == null || !m49752(interfaceC4785)) {
            return;
        }
        interfaceC4785.mo13266();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49764(float f, float f2) {
        this.f73185.mo13257(f, f2);
        InterfaceC4784 interfaceC4784 = this.f73184;
        if (interfaceC4784 != null) {
            interfaceC4784.mo13257(f, f2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49773(AbstractC16511 abstractC16511) {
        this.f73185.mo13262(abstractC16511);
        InterfaceC4784 interfaceC4784 = this.f73184;
        if (interfaceC4784 != null) {
            interfaceC4784.mo13262(abstractC16511);
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m49777() {
        InterfaceC4784 interfaceC4784 = this.f73185;
        boolean zMo13268 = m49752(interfaceC4784) ? interfaceC4784.mo13268() : true;
        InterfaceC4784 interfaceC4785 = this.f73184;
        return (interfaceC4785 == null || interfaceC4785.getState() == 0) ? zMo13268 : zMo13268 & interfaceC4785.mo13268();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m49791(C5345 c5345) {
        return m49754(c5345) != null;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m49781(C5345 c5345) {
        return m49753(c5345, this.f73185) && m49753(c5345, this.f73184);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0044  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m49753(C5345 c5345, InterfaceC4784 interfaceC4784) {
        C5345 c5345M14847;
        if (interfaceC4784 != null) {
            InterfaceC18739[] interfaceC18739Arr = c5345.f18467;
            int i = this.f73183;
            InterfaceC18739 interfaceC18739 = interfaceC18739Arr[i];
            if (interfaceC4784.mo13273() != null) {
                if (interfaceC4784.mo13273() == interfaceC18739) {
                    if (interfaceC18739 != null && !interfaceC4784.mo13253()) {
                        C5345 c5345M14848 = c5345.m14847();
                        if (!c5345.f18464.f72813 || c5345M14848 == null || !c5345M14848.f18459 || (!(interfaceC4784 instanceof C14943) && !(interfaceC4784 instanceof C23422) && interfaceC4784.mo13271() < c5345M14848.m14832())) {
                            c5345M14847 = c5345.m14847();
                            return c5345M14847 != null ? false : false;
                        }
                    }
                } else {
                    c5345M14847 = c5345.m14847();
                    if (c5345M14847 != null || c5345M14847.f18467[i] != interfaceC4784.mo13273()) {
                    }
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m49785(long j, long j2) {
        InterfaceC4784 interfaceC4784 = this.f73185;
        if (m49752(interfaceC4784)) {
            interfaceC4784.mo13260(j, j2);
        }
        InterfaceC4784 interfaceC4785 = this.f73184;
        if (interfaceC4785 == null || !m49752(interfaceC4785)) {
            return;
        }
        interfaceC4785.mo13260(j, j2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m49776(C5345 c5345) {
        InterfaceC4784 interfaceC4784M49754 = m49754(c5345);
        return interfaceC4784M49754 == null || interfaceC4784M49754.mo13253() || interfaceC4784M49754.mo13264() || interfaceC4784M49754.mo13268();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m49755(C5345 c5345) {
        InterfaceC4784 interfaceC4784M49754 = m49754(c5345);
        interfaceC4784M49754.getClass();
        interfaceC4784M49754.mo13274();
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m49792() {
        InterfaceC4784 interfaceC4784 = this.f73185;
        if (interfaceC4784.getState() == 1 && this.f73186 != 4) {
            interfaceC4784.start();
            return;
        }
        InterfaceC4784 interfaceC4785 = this.f73184;
        if (interfaceC4785 == null || interfaceC4785.getState() != 1 || this.f73186 == 3) {
            return;
        }
        interfaceC4785.start();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m49789() {
        InterfaceC4784 interfaceC4784 = this.f73185;
        if (m49752(interfaceC4784) && interfaceC4784.getState() == 2) {
            interfaceC4784.stop();
        }
        InterfaceC4784 interfaceC4785 = this.f73184;
        if (interfaceC4785 == null || interfaceC4785.getState() == 0 || interfaceC4785.getState() != 2) {
            return;
        }
        interfaceC4785.stop();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49767(Object obj, C5345 c5345) {
        InterfaceC4784 interfaceC4784M49754 = m49754(c5345);
        interfaceC4784M49754.getClass();
        interfaceC4784M49754.mo13941(11, obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49768(C4078 c4078) {
        this.f73185.mo13941(18, c4078);
        InterfaceC4784 interfaceC4784 = this.f73184;
        if (interfaceC4784 != null) {
            interfaceC4784.mo13941(18, c4078);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49771(C9807 c9807) {
        InterfaceC4784 interfaceC4784 = this.f73185;
        m49750(interfaceC4784, c9807);
        InterfaceC4784 interfaceC4785 = this.f73184;
        if (interfaceC4785 != null) {
            boolean z = (interfaceC4785.getState() == 0 || this.f73186 == 3) ? false : true;
            m49750(interfaceC4785, c9807);
            m49751(false);
            if (z) {
                interfaceC4785.getClass();
                interfaceC4785.mo13941(17, interfaceC4784);
            }
        }
        this.f73186 = 0;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void m49782() {
        int i = this.f73186;
        if (i != 3 && i != 4) {
            if (i == 2) {
                this.f73186 = 0;
                return;
            }
            return;
        }
        boolean z = i == 4;
        InterfaceC4784 interfaceC4784 = this.f73185;
        InterfaceC4784 interfaceC4785 = this.f73184;
        if (z) {
            interfaceC4785.getClass();
            interfaceC4785.mo13941(17, interfaceC4784);
        } else {
            interfaceC4785.getClass();
            interfaceC4784.mo13941(17, interfaceC4785);
        }
        this.f73186 = this.f73186 != 4 ? 1 : 0;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m49787(C9807 c9807) {
        InterfaceC4784 interfaceC4784;
        if (m49790()) {
            int i = this.f73186;
            boolean z = i == 4 || i == 2;
            int i2 = i != 4 ? 0 : 1;
            if (!z) {
                interfaceC4784 = this.f73184;
                interfaceC4784.getClass();
            } else {
                interfaceC4784 = this.f73185;
            }
            m49750(interfaceC4784, c9807);
            m49751(z);
            this.f73186 = i2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49774(InterfaceC18739 interfaceC18739, C9807 c9807, long j, boolean z) {
        InterfaceC4784 interfaceC4784 = this.f73185;
        if (m49752(interfaceC4784)) {
            if (interfaceC18739 != interfaceC4784.mo13273()) {
                m49750(interfaceC4784, c9807);
            } else if (z) {
                interfaceC4784.mo13259(j);
            }
        }
        InterfaceC4784 interfaceC4785 = this.f73184;
        if (interfaceC4785 == null || !m49752(interfaceC4785)) {
            return;
        }
        if (interfaceC18739 != interfaceC4785.mo13273()) {
            m49750(interfaceC4785, c9807);
        } else if (z) {
            interfaceC4785.mo13259(j);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m49750(InterfaceC4784 interfaceC4784, C9807 c9807) {
        C2023.m6510(this.f73185 == interfaceC4784 || this.f73184 == interfaceC4784);
        if (m49752(interfaceC4784)) {
            c9807.m24913(interfaceC4784);
            if (interfaceC4784.getState() == 2) {
                interfaceC4784.stop();
            }
            interfaceC4784.mo13254();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49769(C5345 c5345, long j) {
        InterfaceC4784 interfaceC4784M49754 = m49754(c5345);
        if (interfaceC4784M49754 != null) {
            interfaceC4784M49754.mo13259(j);
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m49779() {
        if (!m49752(this.f73185)) {
            m49751(true);
        }
        InterfaceC4784 interfaceC4784 = this.f73184;
        if (interfaceC4784 == null || interfaceC4784.getState() != 0) {
            return;
        }
        m49751(false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m49751(boolean z) {
        if (z) {
            if (this.f73182) {
                this.f73185.reset();
                this.f73182 = false;
                return;
            }
            return;
        }
        if (this.f73187) {
            InterfaceC4784 interfaceC4784 = this.f73184;
            interfaceC4784.getClass();
            interfaceC4784.reset();
            this.f73187 = false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m49760(C5345 c5345, C10087 c10087, C9807 c9807) {
        int iM49748 = m49748(this.f73185, c5345, c10087, c9807);
        return iM49748 == 1 ? m49748(this.f73184, c5345, c10087, c9807) : iM49748;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m49748(InterfaceC4784 interfaceC4784, C5345 c5345, C10087 c10087, C9807 c9807) {
        InterfaceC4784 interfaceC4785;
        int i;
        InterfaceC18739[] interfaceC18739Arr = c5345.f18467;
        if (interfaceC4784 == null || interfaceC4784.getState() == 0 || (interfaceC4784 == (interfaceC4785 = this.f73185) && ((i = this.f73186) == 2 || i == 4))) {
            return 1;
        }
        if (interfaceC4784 == this.f73184 && this.f73186 == 3) {
            return 1;
        }
        InterfaceC18739 interfaceC18739Mo13273 = interfaceC4784.mo13273();
        int i2 = this.f73183;
        boolean z = interfaceC18739Mo13273 != interfaceC18739Arr[i2];
        boolean zM25496 = c10087.m25496(i2);
        if (!zM25496 || z) {
            if (!interfaceC4784.mo13269()) {
                InterfaceC6558 interfaceC6558 = c10087.f34440[i2];
                int length = interfaceC6558 != null ? interfaceC6558.length() : 0;
                C7648[] c7648Arr = new C7648[length];
                for (int i3 = 0; i3 < length; i3++) {
                    interfaceC6558.getClass();
                    c7648Arr[i3] = interfaceC6558.mo37958(i3);
                }
                InterfaceC18739 interfaceC18739 = interfaceC18739Arr[i2];
                interfaceC18739.getClass();
                interfaceC4784.mo13263(c7648Arr, interfaceC18739, c5345.m14832(), c5345.m14844(), c5345.f18464.f72815);
                return 3;
            }
            if (!interfaceC4784.mo13268()) {
                return 0;
            }
            m49750(interfaceC4784, c9807);
            if (!zM25496 || m49790()) {
                m49751(interfaceC4784 == interfaceC4785);
                return 1;
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49770(C5490 c5490, InterfaceC6558 interfaceC6558, InterfaceC18739 interfaceC18739, long j, boolean z, boolean z2, long j2, long j3, C15274 c15274, C9807 c9807) {
        int length = interfaceC6558 != null ? interfaceC6558.length() : 0;
        C7648[] c7648Arr = new C7648[length];
        for (int i = 0; i < length; i++) {
            interfaceC6558.getClass();
            c7648Arr[i] = interfaceC6558.mo37958(i);
        }
        int i2 = this.f73186;
        if (i2 == 0 || i2 == 2 || i2 == 4) {
            this.f73182 = true;
            this.f73185.mo13261(c5490, c7648Arr, interfaceC18739, z, z2, j2, j3, c15274);
            c9807.m24915(this.f73185);
        } else {
            this.f73187 = true;
            InterfaceC4784 interfaceC4784 = this.f73184;
            interfaceC4784.getClass();
            interfaceC4784.mo13261(c5490, c7648Arr, interfaceC18739, z, z2, j2, j3, c15274);
            c9807.m24915(interfaceC4784);
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m49759() {
        this.f73185.mo13256();
        this.f73182 = false;
        InterfaceC4784 interfaceC4784 = this.f73184;
        if (interfaceC4784 != null) {
            interfaceC4784.mo13256();
            this.f73187 = false;
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m49756() {
        int i = this.f73186;
        if (i != 0 && i != 2 && i != 4) {
            InterfaceC4784 interfaceC4784 = this.f73184;
            interfaceC4784.getClass();
            return interfaceC4784.getState() != 0;
        }
        return m49752(this.f73185);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m49752(InterfaceC4784 interfaceC4784) {
        return interfaceC4784.getState() != 0;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    private InterfaceC4784 m49754(C5345 c5345) {
        if (c5345 == null) {
            return null;
        }
        InterfaceC18739[] interfaceC18739Arr = c5345.f18467;
        int i = this.f73183;
        if (interfaceC18739Arr[i] == null) {
            return null;
        }
        InterfaceC4784 interfaceC4784 = this.f73185;
        if (interfaceC4784.mo13273() == interfaceC18739Arr[i]) {
            return interfaceC4784;
        }
        InterfaceC4784 interfaceC4785 = this.f73184;
        if (interfaceC4785 == null || interfaceC4785.mo13273() != interfaceC18739Arr[i]) {
            return null;
        }
        return interfaceC4785;
    }
}

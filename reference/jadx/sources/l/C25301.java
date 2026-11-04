package l;

/* JADX INFO: renamed from: l.᩻᩷ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6428 */
/* JADX INFO: loaded from: classes.dex */
public final class C25301 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final C13477 f81707 = new C13477();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C22010 f81708;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f81709;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C15252 f81710;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C22092 f81711;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C14764 f81712;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C15714 f81713;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C7312 f81714;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C15400 f81715;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C3168 f81716;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C19991 f81717;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C24705 f81718;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C25301 m56500(C4747 c4747) {
        C25301 c25301 = (C25301) c4747.m14643(f81707);
        return c25301 == null ? new C25301(c4747) : c25301;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m56515(C3168 c3168, C15714 c15714) {
        new C14354(this).m34777(c3168, c3168.f10273, c15714);
        new C0185(this).m1493(c3168, c3168.f10273, c15714);
        new C13608(this).m33356(c3168, c3168.f10273, c15714);
        C8388 c8388 = new C8388(this);
        AbstractC8036 abstractC8036 = c3168.f10273;
        try {
            this.f81716 = c3168;
            this.f81713 = c15714;
            c8388.f7757 = new C18499();
            c8388.mo5474(abstractC8036);
        } finally {
            c8388.f7757 = null;
            this.f81713 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m56516(C3168 c3168, C16327 c16327, C15714 c15714, boolean z) {
        C7312 c7312 = this.f81714;
        C9548 c9548 = !z ? new C9548(c7312) : null;
        try {
            new C22317(this).m34777(c3168, c16327, c15714);
        } finally {
            if (!z) {
                c7312.m20036(c9548);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14769 m56514(C3168 c3168, C16327 c16327, C15714 c15714) {
        C7312 c7312 = this.f81714;
        C9548 c9548 = new C9548(c7312);
        try {
            C11128 c11128 = new C11128(this);
            c11128.f35081 = AbstractC17836.m41689(c3168.f10279.f26345);
            c11128.m1493(c3168, c16327, c15714);
            C23063 c23063 = new C23063(this);
            c23063.m33356(c3168, c16327, c15714);
            return c23063.f74815;
        } finally {
            c7312.m20036(c9548);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m56517(C3168 c3168, AbstractC8036 abstractC8036, C15714 c15714) {
        C7312 c7312 = this.f81714;
        C9548 c9548 = new C9548(c7312);
        try {
            C2180 c2180 = new C2180(this);
            c2180.m34777(c3168, abstractC8036, c15714);
            return c2180.f45262 != EnumC5909.f20224;
        } finally {
            c7312.m20036(c9548);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m56518(C3168 c3168, AbstractC8036 abstractC8036, C15714 c15714) {
        C7312 c7312 = this.f81714;
        C9548 c9548 = new C9548(c7312);
        try {
            C11874 c11874 = new C11874(this);
            c11874.m34777(c3168, abstractC8036, c15714);
            return c11874.m29757();
        } finally {
            c7312.m20036(c9548);
        }
    }

    public C25301(C4747 c4747) {
        c4747.m14646(f81707, this);
        this.f81710 = C15252.m36599(c4747);
        this.f81714 = C7312.m20023(c4747);
        this.f81712 = C14764.m35506(c4747);
        this.f81718 = C24705.m55066(c4747);
        this.f81711 = C22092.m49912(c4747);
        this.f81715 = C15400.m36873(c4747);
        this.f81708 = C22010.m49750(c4747);
        this.f81717 = C19991.m45972(c4747);
        this.f81709 = EnumC3666.f12551.m11915(EnumC20820.m47625(c4747));
    }
}

package l;

/* JADX INFO: renamed from: l.ۢۡ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: B6QQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C10024 implements AutoCloseable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f32149;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final CharSequence f32150;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C15508 f32151;

    public C10024(CharSequence charSequence, C15508 c15508) {
        this.f32150 = charSequence;
        this.f32151 = c15508;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10024 m25874(CharSequence charSequence) {
        if (charSequence instanceof InterfaceC9629) {
            C15508 c15508Mo15337 = ((InterfaceC9629) charSequence).mo15337();
            return new C10024(c15508Mo15337, c15508Mo15337);
        }
        return new C10024(charSequence, null);
    }

    public final CharSequence range(int i, int i2) {
        int length = length();
        if (i >= 0 && i2 >= i && i2 <= length) {
            return new C18975(this, i, i2);
        }
        throw new IndexOutOfBoundsException("Invalid diff text range");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m25876(C10024 c10024) {
        if (c10024.f32149) {
            throw new IllegalStateException("Diff reader is closed");
        }
    }

    public final int length() {
        if (!this.f32149) {
            return this.f32150.length();
        }
        throw new IllegalStateException("Diff reader is closed");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m25875(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException("Invalid diff text range");
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f32149) {
            return;
        }
        this.f32149 = true;
        C15508 c15508 = this.f32151;
        if (c15508 != null) {
            c15508.close();
        }
    }
}

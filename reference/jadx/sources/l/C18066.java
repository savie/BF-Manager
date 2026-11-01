package l;

import android.graphics.Point;

/* JADX INFO: renamed from: l.ᩳ۬ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: B929 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18066 extends RuntimeException {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f57777;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f57778;

    @Override // java.lang.Throwable
    public final /* bridge */ /* synthetic */ Throwable initCause(Throwable th) {
        initCause(th);
        return this;
    }

    public C18066(Point point, String str) {
        this(null, point.x, point.y, str);
    }

    @Override // java.lang.Throwable
    public final synchronized void initCause(Throwable th) {
        super.initCause(th);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42064(C6111 c6111) {
        C8500.m22223(this.f57778, this.f57777).m22227(c6111);
    }

    public C18066(String str, int i, int i2, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str != null) {
            sb.append("[");
            sb.append(str);
            sb.append("] line ");
            sb.append(i);
            if (i2 > 0) {
                sb.append(':');
                sb.append(i2 + 1);
            }
        } else if (i2 > 0) {
            sb.append('[');
            sb.append(i);
            sb.append(':');
            sb.append(i2 + 1);
            sb.append(']');
        } else {
            sb.append("[line ");
            sb.append(i);
            sb.append(']');
        }
        if (str2 != null && !str2.isEmpty()) {
            sb.append(' ');
            sb.append(str2);
        }
        super(sb.toString());
        this.f57778 = i;
        this.f57777 = i2;
    }
}

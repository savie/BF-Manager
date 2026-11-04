package l;

import java.io.InputStream;

/* JADX INFO: renamed from: l.᩸᩵ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6DV */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23025 extends AbstractC8909 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InputStream f74717;

    public AbstractC23025(InputStream inputStream) {
        super(6);
        this.f74717 = inputStream;
    }

    @Override // l.AbstractC8909
    public final String toString() {
        return getClass().getSimpleName() + "[" + this.f74717.toString() + "]";
    }
}

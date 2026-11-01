package l;

import java.lang.ref.SoftReference;
import org.bouncycastle.math.ec.custom.sec.SecP521R1Field;

/* JADX INFO: renamed from: l.᩵֨ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0CLW */
/* JADX INFO: loaded from: classes4.dex */
public final class C19132 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object[] f61802;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f61803;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized Object m43952() {
        Object obj;
        Object[] objArr = this.f61802;
        int i = this.f61803;
        obj = objArr[i];
        objArr[i] = null;
        this.f61803 = (i - 1) & SecP521R1Field.P16;
        return obj;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m43953(SoftReference softReference) {
        int i = (this.f61803 + 1) & SecP521R1Field.P16;
        this.f61803 = i;
        this.f61802[i] = softReference;
    }

    public C19132() {
        this.f61802 = new Object[512];
        this.f61803 = 0;
    }

    public /* synthetic */ C19132(int i) {
        this();
    }
}

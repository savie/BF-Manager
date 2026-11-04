package l;

import java.util.Random;

/* JADX INFO: renamed from: l.ۗۡ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: PAX3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3311 extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        return new Random();
    }
}

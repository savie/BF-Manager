package l;

import java.util.Map;

/* JADX INFO: renamed from: l.᩸ܳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: O2OZ */
/* JADX INFO: loaded from: classes.dex */
public final class C22876 extends AbstractC15548 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object f74332;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15416 f74333;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f74334;

    public C22876(C15416 c15416, int i) {
        this.f74333 = c15416;
        this.f74332 = C15416.m36898(c15416, i);
        this.f74334 = i;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f74332;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m51603() {
        int i = this.f74334;
        Object obj = this.f74332;
        C15416 c15416 = this.f74333;
        if (i == -1 || i >= c15416.size() || !C17359.equals(obj, C15416.m36898(c15416, this.f74334))) {
            this.f74334 = c15416.m36896(obj);
        }
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        C15416 c15416 = this.f74333;
        Map mapM36914 = c15416.m36914();
        if (mapM36914 != null) {
            return mapM36914.get(this.f74332);
        }
        m51603();
        int i = this.f74334;
        if (i == -1) {
            return null;
        }
        return C15416.m36912(c15416, i);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        C15416 c15416 = this.f74333;
        Map mapM36914 = c15416.m36914();
        Object obj2 = this.f74332;
        if (mapM36914 != null) {
            return mapM36914.put(obj2, obj);
        }
        m51603();
        int i = this.f74334;
        if (i == -1) {
            c15416.put(obj2, obj);
            return null;
        }
        Object objM36912 = C15416.m36912(c15416, i);
        C15416.m36900(c15416, this.f74334, obj);
        return objM36912;
    }
}

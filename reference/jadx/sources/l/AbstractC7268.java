package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.۟ۚ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Z69D */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7268 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public String f24183;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C23805 f24184;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public ArrayList f24185;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f24186;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f24187;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Object f24188;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Object mo19401(Object obj) {
        return obj;
    }

    public AbstractC7268(C23805 c23805, String str) {
        this.f24187 = 0;
        this.f24186 = false;
        this.f24183 = str;
        this.f24184 = c23805;
    }

    public AbstractC7268(C23805 c23805, String str, Object obj) {
        this(c23805, str);
        m19399(obj);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m19397() {
        this.f24187 = 0;
        this.f24186 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19399(Object obj) {
        if (obj == null) {
            return;
        }
        ArrayList arrayList = this.f24185;
        if (arrayList != null) {
            arrayList.add(obj);
            return;
        }
        if (this.f24188 == null) {
            this.f24188 = obj;
            return;
        }
        ArrayList arrayList2 = new ArrayList(5);
        this.f24185 = arrayList2;
        arrayList2.add(this.f24188);
        this.f24188 = null;
        this.f24185.add(obj);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m19402() {
        ArrayList arrayList;
        return (this.f24188 != null && this.f24187 < 1) || ((arrayList = this.f24185) != null && this.f24187 < arrayList.size());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m19398() {
        int size = this.f24188 != null ? 1 : 0;
        ArrayList arrayList = this.f24185;
        if (arrayList != null) {
            size = arrayList.size();
        }
        String str = this.f24183;
        if (size == 0) {
            throw new C10091(str);
        }
        int i = this.f24187;
        if (i >= size) {
            if (size == 1) {
                return mo19401(this.f24188);
            }
            throw new C8680(str);
        }
        Object obj = this.f24188;
        if (obj != null) {
            this.f24187 = i + 1;
            return mo19401(obj);
        }
        Object objMo19401 = mo19401(this.f24185.get(i));
        this.f24187++;
        return objMo19401;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Object m19400() {
        int size = this.f24188 != null ? 1 : 0;
        ArrayList arrayList = this.f24185;
        if (arrayList != null) {
            size = arrayList.size();
        }
        if (this.f24186 || (this.f24187 >= size && size == 1)) {
            return ((C20674) this).f24184.m52467(m19398(), (Object) null);
        }
        return m19398();
    }
}

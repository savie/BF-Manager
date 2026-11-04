package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۙܺۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z69D */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5015 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C17370 f17399;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f17400;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Object f17401;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public ArrayList f17402;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f17403;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f17404;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Object mo15242(Object obj) {
        return obj;
    }

    public AbstractC5015(C17370 c17370, String str) {
        this.f17403 = 0;
        this.f17400 = false;
        this.f17404 = str;
        this.f17399 = c17370;
    }

    public AbstractC5015(C17370 c17370, String str, Object obj) {
        this(c17370, str);
        m15240(obj);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m15244() {
        this.f17403 = 0;
        this.f17400 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15240(Object obj) {
        if (obj == null) {
            return;
        }
        ArrayList arrayList = this.f17402;
        if (arrayList != null) {
            arrayList.add(obj);
            return;
        }
        if (this.f17401 == null) {
            this.f17401 = obj;
            return;
        }
        ArrayList arrayList2 = new ArrayList(5);
        this.f17402 = arrayList2;
        arrayList2.add(this.f17401);
        this.f17401 = null;
        this.f17402.add(obj);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m15243() {
        ArrayList arrayList;
        return (this.f17401 != null && this.f17403 < 1) || ((arrayList = this.f17402) != null && this.f17403 < arrayList.size());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m15239() {
        int size = this.f17401 != null ? 1 : 0;
        ArrayList arrayList = this.f17402;
        if (arrayList != null) {
            size = arrayList.size();
        }
        String str = this.f17404;
        if (size == 0) {
            throw new C14205(str);
        }
        int i = this.f17403;
        if (i >= size) {
            if (size == 1) {
                return mo15242(this.f17401);
            }
            throw new C7494(str);
        }
        Object obj = this.f17401;
        if (obj != null) {
            this.f17403 = i + 1;
            return mo15242(obj);
        }
        Object objMo15242 = mo15242(this.f17402.get(i));
        this.f17403++;
        return objMo15242;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Object m15241() {
        int size = this.f17401 != null ? 1 : 0;
        ArrayList arrayList = this.f17402;
        if (arrayList != null) {
            size = arrayList.size();
        }
        if (this.f17400 || (this.f17403 >= size && size == 1)) {
            return ((C22169) this).f17399.m40811(m15239(), (Object) null);
        }
        return m15239();
    }
}

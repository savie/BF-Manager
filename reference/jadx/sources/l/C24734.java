package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.᩻ۖۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: I73O */
/* JADX INFO: loaded from: classes.dex */
public final class C24734 implements AutoCloseable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f80077;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f80079;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public EnumC11307 f80076 = EnumC11307.UNKNOWN;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ArrayList f80078 = new ArrayList();

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f80077) {
            return;
        }
        this.f80077 = true;
        m55221();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized List m55222(EnumC1613 enumC1613, C12799 c12799) {
        EnumC11307 enumC11307;
        List list;
        if (!this.f80077 && (enumC11307 = this.f80076) != EnumC11307.LIVE) {
            if (enumC1613 == EnumC1613.LIVE) {
                m55221();
                return Collections.EMPTY_LIST;
            }
            if (enumC1613 != EnumC1613.VOD) {
                if (c12799 == null) {
                    return Collections.EMPTY_LIST;
                }
                if (enumC11307 == EnumC11307.VOD) {
                    return Collections.singletonList(c12799);
                }
                this.f80078.add(c12799);
                return Collections.EMPTY_LIST;
            }
            m55220();
            if (c12799 != null) {
                this.f80078.add(c12799);
            }
            ArrayList arrayList = this.f80078;
            if (arrayList.isEmpty()) {
                list = Collections.EMPTY_LIST;
            } else {
                ArrayList arrayList2 = new ArrayList(arrayList);
                arrayList.clear();
                list = arrayList2;
            }
            return list;
        }
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m55223(C24907 c24907) {
        if (!this.f80077 && c24907 != null && this.f80076 != EnumC11307.LIVE) {
            if (c24907.f80600) {
                m55220();
            } else {
                m55221();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m55224() {
        if (!this.f80077 && this.f80076 != EnumC11307.LIVE) {
            m55220();
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final synchronized EnumC11307 m55225() {
        return this.f80076;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final synchronized long m55226() {
        return (this.f80077 || this.f80076 != EnumC11307.VOD) ? -1L : this.f80079;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized List m55227() {
        List list;
        if (!this.f80077 && this.f80076 == EnumC11307.VOD) {
            ArrayList arrayList = this.f80078;
            if (arrayList.isEmpty()) {
                list = Collections.EMPTY_LIST;
            } else {
                ArrayList arrayList2 = new ArrayList(arrayList);
                arrayList.clear();
                list = arrayList2;
            }
            return list;
        }
        return Collections.EMPTY_LIST;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001d  */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m55228(long j) {
        boolean z;
        if (j < 0) {
            z = false;
        } else if (!this.f80077 && this.f80076 == EnumC11307.VOD && this.f80079 == j) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private void m55221() {
        EnumC11307 enumC11307 = this.f80076;
        EnumC11307 enumC11308 = EnumC11307.LIVE;
        if (enumC11307 != enumC11308) {
            this.f80076 = enumC11308;
            this.f80079++;
        }
        this.f80078.clear();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m55220() {
        EnumC11307 enumC11307 = this.f80076;
        EnumC11307 enumC11308 = EnumC11307.VOD;
        if (enumC11307 != enumC11308) {
            this.f80076 = enumC11308;
            this.f80079++;
        }
    }
}

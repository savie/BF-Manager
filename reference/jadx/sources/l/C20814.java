package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.᩷ۤ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: I73O */
/* JADX INFO: loaded from: classes4.dex */
public final class C20814 implements AutoCloseable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f67654;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f67656;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public EnumC7408 f67655 = EnumC7408.UNKNOWN;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final ArrayList f67653 = new ArrayList();

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f67654) {
            return;
        }
        this.f67654 = true;
        m46806();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final synchronized EnumC7408 m46808() {
        return this.f67655;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized List m46809(EnumC10231 enumC10231, C19403 c19403) {
        EnumC7408 enumC7408;
        List list;
        if (!this.f67654 && (enumC7408 = this.f67655) != EnumC7408.LIVE) {
            if (enumC10231 == EnumC10231.LIVE) {
                m46806();
                return Collections.EMPTY_LIST;
            }
            if (enumC10231 != EnumC10231.VOD) {
                if (c19403 == null) {
                    return Collections.EMPTY_LIST;
                }
                if (enumC7408 == EnumC7408.VOD) {
                    return Collections.singletonList(c19403);
                }
                this.f67653.add(c19403);
                return Collections.EMPTY_LIST;
            }
            m46807();
            if (c19403 != null) {
                this.f67653.add(c19403);
            }
            ArrayList arrayList = this.f67653;
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
    public final synchronized void m46810(C16325 c16325) {
        if (!this.f67654 && c16325 != null && this.f67655 != EnumC7408.LIVE) {
            if (c16325.f52572) {
                m46807();
            } else {
                m46806();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m46811() {
        if (!this.f67654 && this.f67655 != EnumC7408.LIVE) {
            m46807();
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final synchronized List m46812() {
        List list;
        if (!this.f67654 && this.f67655 == EnumC7408.VOD) {
            ArrayList arrayList = this.f67653;
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
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m46813(long j) {
        boolean z;
        if (j < 0) {
            z = false;
        } else if (!this.f67654 && this.f67655 == EnumC7408.VOD && this.f67656 == j) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final synchronized long m46814() {
        return (this.f67654 || this.f67655 != EnumC7408.VOD) ? -1L : this.f67656;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private void m46806() {
        EnumC7408 enumC7408 = this.f67655;
        EnumC7408 enumC7409 = EnumC7408.LIVE;
        if (enumC7408 != enumC7409) {
            this.f67655 = enumC7409;
            this.f67656++;
        }
        this.f67653.clear();
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    private void m46807() {
        EnumC7408 enumC7408 = this.f67655;
        EnumC7408 enumC7409 = EnumC7408.VOD;
        if (enumC7408 != enumC7409) {
            this.f67655 = enumC7409;
            this.f67656++;
        }
    }
}

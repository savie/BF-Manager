package l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: l.ۢܿۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6X9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10274 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f32807;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ReentrantLock f32808;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Condition f32809;

    public C10274() {
        ReentrantLock reentrantLock = new ReentrantLock(true);
        this.f32808 = reentrantLock;
        this.f32809 = reentrantLock.newCondition();
        this.f32807 = new ArrayList();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19225 m26483(String str) {
        return m26479((Collection) Collections.singletonList(str), false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19225 m26485(List list) {
        return m26479((Collection) list, false);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C19225 m26486(String str) {
        return m26479((Collection) Collections.singletonList(str), true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19225 m26484(Collection collection) {
        return m26479(collection, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C19225 m26479(Collection collection, boolean z) throws C10186 {
        ArrayList arrayList = new ArrayList(new LinkedHashSet(collection));
        Collections.sort(arrayList);
        if (arrayList.isEmpty()) {
            throw C10186.m26305("FILE_INVALID_PATH", "At least one path claim is required.");
        }
        ReentrantLock reentrantLock = this.f32808;
        C10801.m27511(reentrantLock);
        while (m26480(arrayList, z)) {
            try {
                try {
                    C21990 c21990M27505 = C10801.m27505();
                    try {
                        this.f32809.await();
                        c21990M27505.close();
                    } catch (Throwable th) {
                        try {
                            c21990M27505.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw C10186.m26300("FILE_OPERATION_INTERRUPTED", "File operation was interrupted while waiting for a path claim.");
                }
            } catch (Throwable th3) {
                reentrantLock.unlock();
                throw th3;
            }
        }
        C8038 c8038 = new C8038(arrayList, z);
        this.f32807.add(c8038);
        C19225 c19225 = new C19225(this, c8038);
        reentrantLock.unlock();
        return c19225;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m26480(ArrayList arrayList, boolean z) {
        for (C8038 c8038 : this.f32807) {
            if (z || c8038.f26662) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    for (String str2 : c8038.f26661) {
                        if (C0470.m2302(str, str2) || C0470.m2302(str2, str)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}

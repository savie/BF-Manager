package l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: l.᩻᩸۬, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6X9 */
/* JADX INFO: loaded from: classes.dex */
public final class C23968 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f77708;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ReentrantLock f77709;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Condition f77710;

    public C23968() {
        ReentrantLock reentrantLock = new ReentrantLock(true);
        this.f77709 = reentrantLock;
        this.f77710 = reentrantLock.newCondition();
        this.f77708 = new ArrayList();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11268 m52809(String str) {
        return m52805((Collection) Collections.singletonList(str), false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11268 m52811(List list) {
        return m52805((Collection) list, false);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C11268 m52812(String str) {
        return m52805((Collection) Collections.singletonList(str), true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11268 m52810(Collection collection) {
        return m52805(collection, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C11268 m52805(Collection collection, boolean z) throws C12731 {
        ArrayList arrayList = new ArrayList(new LinkedHashSet(collection));
        Collections.sort(arrayList);
        if (arrayList.isEmpty()) {
            throw C12731.m31630("FILE_INVALID_PATH", "At least one path claim is required.");
        }
        ReentrantLock reentrantLock = this.f77709;
        reentrantLock.lock();
        while (m52806(arrayList, z)) {
            try {
                try {
                    this.f77710.await();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw C12731.m31625("FILE_OPERATION_INTERRUPTED", "File operation was interrupted while waiting for a path claim.");
                }
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        C6328 c6328 = new C6328(arrayList, z);
        this.f77708.add(c6328);
        C11268 c11268 = new C11268(this, c6328);
        reentrantLock.unlock();
        return c11268;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m52806(ArrayList arrayList, boolean z) {
        for (C6328 c6328 : this.f77708) {
            if (z || c6328.f21370) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    for (String str2 : c6328.f21369) {
                        if (C6370.m17477(str, str2) || C6370.m17477(str2, str)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}

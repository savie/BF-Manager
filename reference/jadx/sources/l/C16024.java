package l;

import android.os.Looper;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.ܶۤۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: HAQ9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16024 extends Error {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final ArrayList f51986 = new ArrayList();

    /* JADX WARN: Illegal instructions before constructor call */
    public C16024(long j, Map map) {
        StringBuilder sbM8289 = C2458.m8289("Application unresponsive for at least ", " ms.", j);
        for (Map.Entry entry : map.entrySet()) {
            Thread thread = (Thread) entry.getKey();
            sbM8289.append('\n');
            sbM8289.append(thread.getName());
            sbM8289.append(" (state = ");
            sbM8289.append(thread.getState());
            sbM8289.append(MotionUtils.EASING_TYPE_FORMAT_END);
            for (StackTraceElement stackTraceElement : (StackTraceElement[]) entry.getValue()) {
                sbM8289.append("\n    at ");
                sbM8289.append(stackTraceElement);
            }
        }
        super(sbM8289.toString());
        Iterator it = f51986.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        String localizedMessage = getLocalizedMessage();
        return localizedMessage != null ? "ANRError: ".concat(localizedMessage) : "ANRError";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16024 m38148() {
        return m38150(0L, "", null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16024 m38150(long j, String str, C3346 c3346) {
        final Thread thread = Looper.getMainLooper().getThread();
        TreeMap treeMap = new TreeMap(new Comparator() { // from class: l.ܽۤۤ
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                Thread thread2 = (Thread) obj;
                Thread thread3 = (Thread) obj2;
                if (thread2 == thread3) {
                    return 0;
                }
                Thread thread4 = thread;
                if (thread2 == thread4) {
                    return -1;
                }
                if (thread3 == thread4) {
                    return 1;
                }
                return thread3.getName().compareTo(thread2.getName());
            }
        });
        for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
            Thread key = entry.getKey();
            if (key != c3346) {
                StackTraceElement[] value = entry.getValue();
                if (key == thread || (key.getName().startsWith(str) && value.length > 0)) {
                    treeMap.put(key, value);
                }
            }
        }
        if (!treeMap.containsKey(thread)) {
            treeMap.put(thread, thread.getStackTrace());
        }
        return new C16024(j, treeMap);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16024 m38149(long j) {
        Thread thread = Looper.getMainLooper().getThread();
        return new C16024(j, Collections.singletonMap(thread, thread.getStackTrace()));
    }
}

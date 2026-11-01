package l;

import android.os.Looper;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.ۤۨۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: HAQ9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10271 extends Error {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final ArrayList f35015 = new ArrayList();

    /* JADX WARN: Illegal instructions before constructor call */
    public C10271(long j, Map map) {
        StringBuilder sbM39970 = C17114.m39970("Application unresponsive for at least ", " ms.", j);
        for (Map.Entry entry : map.entrySet()) {
            Thread thread = (Thread) entry.getKey();
            sbM39970.append('\n');
            sbM39970.append(thread.getName());
            sbM39970.append(" (state = ");
            sbM39970.append(thread.getState());
            sbM39970.append(MotionUtils.EASING_TYPE_FORMAT_END);
            for (StackTraceElement stackTraceElement : (StackTraceElement[]) entry.getValue()) {
                sbM39970.append("\n    at ");
                sbM39970.append(stackTraceElement);
            }
        }
        super(sbM39970.toString());
        Iterator it = f35015.iterator();
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
    public static C10271 m26056() {
        return m26058(0L, "", null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10271 m26058(long j, String str, C20854 c20854) {
        final Thread thread = Looper.getMainLooper().getThread();
        TreeMap treeMap = new TreeMap(new Comparator() { // from class: l.ۡۨۨ
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
            if (key != c20854) {
                StackTraceElement[] value = entry.getValue();
                if (key == thread || (key.getName().startsWith(str) && value.length > 0)) {
                    treeMap.put(key, value);
                }
            }
        }
        if (!treeMap.containsKey(thread)) {
            treeMap.put(thread, thread.getStackTrace());
        }
        return new C10271(j, treeMap);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10271 m26057(long j) {
        Thread thread = Looper.getMainLooper().getThread();
        return new C10271(j, Collections.singletonMap(thread, thread.getStackTrace()));
    }
}

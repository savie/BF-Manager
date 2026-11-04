package l;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۘ᩹ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: J6BV */
/* JADX INFO: loaded from: classes2.dex */
public final class C4463 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C24601 f15970;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C10792 f15971;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Object f15972 = new Object();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f15973 = new ArrayDeque();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final long f15969 = TimeUnit.MILLISECONDS.toNanos(20);

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final C4463 f15968 = new C4463(new C10792());

    public C4463(C10792 c10792) {
        this.f15971 = c10792;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C24601 m14156(String str) {
        C24601 c24601;
        C4463 c4463 = f15968;
        synchronized (c4463.f15972) {
            c4463.f15971.getClass();
            long jNanoTime = System.nanoTime();
            C6701 c6701 = (C6701) c4463.f15973.peekLast();
            if (c6701 == null || jNanoTime - c6701.f22292 >= 0) {
                c6701 = new C6701(jNanoTime + f15969);
                c4463.f15973.addLast(c6701);
            }
            c24601 = new C24601(c4463, c6701, str.equals("dex_names") || str.equals("files") || str.startsWith("resource_table_"));
            c6701.f22293.add(c24601);
            c4463.f15972.notifyAll();
        }
        try {
            C24601.m54925(c24601);
            return c24601;
        } catch (Error | RuntimeException e) {
            c24601.close();
            throw e;
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static void m14159(C4463 c4463) {
        ArrayDeque arrayDeque = c4463.f15973;
        if (c4463.f15970 != null || arrayDeque.isEmpty()) {
            return;
        }
        C6701 c6701 = (C6701) arrayDeque.getFirst();
        c4463.f15971.getClass();
        long jNanoTime = System.nanoTime();
        long j = c6701.f22292;
        ArrayList<C24601> arrayList = c6701.f22293;
        if (jNanoTime - j < 0) {
            return;
        }
        C24601 c24601 = (C24601) arrayList.get(0);
        for (C24601 c24602 : arrayList) {
            if (c24602.f79696) {
                c24601 = c24602;
                break;
            }
        }
        c4463.f15970 = c24601;
        c4463.f15972.notifyAll();
    }
}

package l;

import java.util.ArrayDeque;
import java.util.List;
import java.util.function.Function;

/* JADX INFO: renamed from: l.֡ۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 86HZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C0394 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Function f1938;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C18293 f1939;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f1940;

    public C0394(C2551 c2551, C21943 c21943, Function function) {
        this.f1938 = function;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f1940 = arrayDeque;
        C18293 c18293 = new C18293(c2551);
        this.f1939 = c18293;
        arrayDeque.addLast(c21943);
        c18293.m42623(c21943);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21943 m2203() {
        ArrayDeque arrayDeque = this.f1940;
        C21943 c21943 = (C21943) arrayDeque.pollLast();
        if (c21943 == null) {
            return null;
        }
        List list = (List) this.f1938.apply(c21943);
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return c21943;
            }
            C21943 c21944 = (C21943) list.get(size);
            if (!this.f1939.m42627(c21944)) {
                arrayDeque.addLast(c21944);
            }
        }
    }
}

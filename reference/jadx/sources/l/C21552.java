package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩶᩶ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: C3HZ */
/* JADX INFO: loaded from: classes.dex */
public final class C21552 extends IllegalArgumentException {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final String f68834 = C14838.class.getName();

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        super.fillInStackTrace();
        StackTraceElement[] stackTrace = getStackTrace();
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTrace) {
            if (!stackTraceElement.getClassName().equals(f68834)) {
                arrayList.add(stackTraceElement);
            }
        }
        setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
        return this;
    }
}

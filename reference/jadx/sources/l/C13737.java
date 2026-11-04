package l;

import java.util.ArrayList;
import java.util.function.ToIntFunction;

/* JADX INFO: renamed from: l.۬ۡۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: 36DM */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C13737 implements ToIntFunction {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f43596;

    public /* synthetic */ C13737(int i) {
        this.f43596 = i;
    }

    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        switch (this.f43596) {
            case 0:
                return ((C24927) obj).getMethods().size();
            default:
                return ((ArrayList) ((C21943) obj).mo1986()).size();
        }
    }
}

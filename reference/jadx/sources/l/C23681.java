package l;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.᩹ܽۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 17JK */
/* JADX INFO: loaded from: classes.dex */
public final class C23681 extends LinkedHashMap {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20697 f76787;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23681(C20697 c20697) {
        super(6, 0.75f, true);
        this.f76787 = c20697;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        if (size() <= 5) {
            return false;
        }
        try {
            ((InterfaceC15475) entry.getValue()).close();
            return true;
        } catch (IOException e) {
            this.f76787.f66333 = e;
            return true;
        }
    }
}

package l;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ܺ᩸ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 17JK */
/* JADX INFO: loaded from: classes4.dex */
public final class C16206 extends LinkedHashMap {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0682 f52311;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16206(C0682 c0682) {
        super(6, 0.75f, true);
        this.f52311 = c0682;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        if (size() <= 5) {
            return false;
        }
        try {
            ((InterfaceC21850) entry.getValue()).close();
            return true;
        } catch (IOException e) {
            this.f52311.f2857 = e;
            return true;
        }
    }
}

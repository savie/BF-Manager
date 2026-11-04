package l;

import java.util.ArrayList;
import java.util.UUID;

/* JADX INFO: renamed from: l.ۖܶ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 36NN */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2764 implements InterfaceC15319, InterfaceC19795, InterfaceC12248, InterfaceC25138 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f9140;

    public /* synthetic */ C2764(int i) {
        this.f9140 = i;
    }

    public /* synthetic */ C2764(C8782 c8782) {
        this.f9140 = 3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m9136(Object obj, ArrayList arrayList, Object obj2, int i, int i2) {
        C17359.requireNonNull(obj);
        arrayList.add(obj2);
        return i + i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m9137(StringBuilder sb, long j, String str) {
        sb.append(j);
        sb.append(str);
        return sb.toString();
    }

    @Override // l.InterfaceC25138
    public Object apply(Object obj) {
        return null;
    }

    @Override // l.InterfaceC12248
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC24183 mo9139(UUID uuid) {
        return C18215.m42362(uuid);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m9138(ArrayList arrayList, int i) {
        arrayList.remove(arrayList.size() - i);
    }

    @Override // l.InterfaceC15319
    /* JADX INFO: renamed from: ۙ */
    public void mo8292(Object obj, C23108 c23108) {
        ((InterfaceC10582) obj).mo7236(new C21771(c23108));
    }

    @Override // l.InterfaceC19795
    public void invoke(Object obj) {
        InterfaceC19992 interfaceC19992 = (InterfaceC19992) obj;
        switch (this.f9140) {
            case 4:
                interfaceC19992.getClass();
                break;
            default:
                interfaceC19992.getClass();
                break;
        }
    }
}

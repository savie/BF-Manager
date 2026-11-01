package l;

import java.io.DataOutputStream;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩵ܿۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: C8OA */
/* JADX INFO: loaded from: classes5.dex */
public final class C19606 extends AbstractC18194 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final ArrayList f62953 = new ArrayList();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public StringBuilder f62954;

    @Override // l.InterfaceC10434
    public final void flush() {
    }

    @Override // l.InterfaceC10434
    /* JADX INFO: renamed from: ۙ */
    public final DataOutputStream mo18523() {
        return null;
    }

    @Override // l.AbstractC18194
    /* JADX INFO: renamed from: ܰ */
    public final String mo18528() {
        return "string";
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ArrayList m44697() {
        return this.f62953;
    }

    public final String toString() {
        return (String) C9030.stream(this.f62953).map(new C18663(6)).collect(C1890.joining(System.lineSeparator()));
    }

    @Override // l.AbstractC18194, l.InterfaceC10434
    /* JADX INFO: renamed from: ܰ */
    public final void mo18529(String str) {
        String str2 = this.f58140;
        if (str2 != null && !str2.equals(str)) {
            throw new RuntimeException(C0242.m1617("Ended with a different class: ", str, "; then ", str2, " was started."));
        }
        StringBuilder sb = this.f62954;
        if (sb != null) {
            this.f62953.add(new C8317(str, sb.toString()));
        }
        super.mo18529(str);
        this.f62954 = null;
    }

    @Override // l.AbstractC18194, l.InterfaceC10434
    /* JADX INFO: renamed from: ۙ */
    public final void mo18525(String str, C11521 c11521, AbstractC0410 abstractC0410) {
        this.f58140 = str;
        this.f62954 = new StringBuilder();
    }

    @Override // l.InterfaceC10434
    /* JADX INFO: renamed from: ۨ */
    public final void mo18527(String str) {
        StringBuilder sb = this.f62954;
        sb.append(str);
        sb.append("\n");
    }

    @Override // l.InterfaceC10434
    /* JADX INFO: renamed from: ۙ */
    public final void mo18524(String str) {
        this.f62954.append(str);
    }
}

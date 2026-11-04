package l;

import java.io.DataOutputStream;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۜۜۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: C8OA */
/* JADX INFO: loaded from: classes3.dex */
public final class C6965 extends AbstractC9201 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public StringBuilder f22991;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ArrayList f22992 = new ArrayList();

    @Override // l.InterfaceC13676
    public final void flush() {
    }

    @Override // l.InterfaceC13676
    /* JADX INFO: renamed from: ۙ */
    public final DataOutputStream mo3876() {
        return null;
    }

    @Override // l.AbstractC9201
    /* JADX INFO: renamed from: ᩷ */
    public final String mo3882() {
        return "string";
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ArrayList m19271() {
        return this.f22992;
    }

    public final String toString() {
        return (String) C1170.stream(this.f22992).map(new C7351(5)).collect(C2025.joining(System.lineSeparator()));
    }

    @Override // l.AbstractC9201, l.InterfaceC13676
    /* JADX INFO: renamed from: ᩷ */
    public final void mo3883(String str) {
        String str2 = this.f30011;
        if (str2 != null && !str2.equals(str)) {
            throw new RuntimeException(C3188.m10404("Ended with a different class: ", str, "; then ", str2, " was started."));
        }
        StringBuilder sb = this.f22991;
        if (sb != null) {
            this.f22992.add(new C8456(str, sb.toString()));
        }
        super.mo3883(str);
        this.f22991 = null;
    }

    @Override // l.AbstractC9201, l.InterfaceC13676
    /* JADX INFO: renamed from: ۙ */
    public final void mo3880(String str, C15867 c15867, AbstractC12931 abstractC12931) {
        this.f30011 = str;
        this.f22991 = new StringBuilder();
    }

    @Override // l.InterfaceC13676
    /* JADX INFO: renamed from: ۤ */
    public final void mo3881(String str) {
        StringBuilder sb = this.f22991;
        sb.append(str);
        sb.append("\n");
    }

    @Override // l.InterfaceC13676
    /* JADX INFO: renamed from: ۙ */
    public final void mo3879(String str) {
        this.f22991.append(str);
    }
}

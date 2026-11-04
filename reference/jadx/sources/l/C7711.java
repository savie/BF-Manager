package l;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.۟ۜۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: KBGJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C7711 extends AbstractC9201 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public ByteArrayOutputStream f25419;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ArrayList f25420 = new ArrayList();

    @Override // l.InterfaceC13676
    public final void flush() {
    }

    @Override // l.AbstractC9201
    /* JADX INFO: renamed from: ᩷ */
    public final String mo3882() {
        return "byte stream";
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ArrayList m20988() {
        return this.f25420;
    }

    public final String toString() {
        return (String) C1170.stream(this.f25420).map(new C9587(7)).collect(C2025.joining(System.lineSeparator()));
    }

    @Override // l.InterfaceC13676
    /* JADX INFO: renamed from: ۙ */
    public final DataOutputStream mo3876() {
        return new DataOutputStream(this.f25419);
    }

    @Override // l.AbstractC9201, l.InterfaceC13676
    /* JADX INFO: renamed from: ᩷ */
    public final void mo3883(String str) {
        String str2 = this.f30011;
        if (str2 != null && !str2.equals(str)) {
            throw new RuntimeException(ExternalValue$$ExternalSyntheticOutline0.m("Ended different class: ", str, " then was started ", str2));
        }
        ByteArrayOutputStream byteArrayOutputStream = this.f25419;
        if (byteArrayOutputStream != null) {
            this.f25420.add(new C0253(str, byteArrayOutputStream.toByteArray()));
        }
        super.mo3883(str);
        this.f25419 = null;
    }

    @Override // l.AbstractC9201, l.InterfaceC13676
    /* JADX INFO: renamed from: ۙ */
    public final void mo3880(String str, C15867 c15867, AbstractC12931 abstractC12931) {
        this.f30011 = str;
        this.f25419 = new ByteArrayOutputStream(1024);
    }

    @Override // l.InterfaceC13676
    /* JADX INFO: renamed from: ۤ */
    public final void mo3881(String str) {
        try {
            this.f25419.write((str + System.lineSeparator()).getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // l.InterfaceC13676
    /* JADX INFO: renamed from: ۙ */
    public final void mo3879(String str) {
        try {
            this.f25419.write(str.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

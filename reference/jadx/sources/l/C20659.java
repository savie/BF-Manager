package l;

import bin.mt.plus.R;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.᩷ۚۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 45AX */
/* JADX INFO: loaded from: classes5.dex */
public final class C20659 extends AbstractC17131 {
    public /* synthetic */ C20659(int i) {
        this();
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static C20659 m46512() {
        return C7253.f24158;
    }

    public C20659() {
    }

    @Override // l.AbstractC17131
    /* JADX INFO: renamed from: ᩳ */
    public final String mo1456() {
        return C16737.m39288(R.string.MT_Protector);
    }

    @Override // l.AbstractC17131
    /* JADX INFO: renamed from: ۘ */
    public final byte[] mo1449() throws IOException {
        InputStream resourceAsStream = C20659.class.getResourceAsStream("/assets/".concat("testkey.pk8"));
        if (resourceAsStream == null) {
            resourceAsStream = C16737.m39286().open("testkey.pk8");
        }
        return C19431.m44470(resourceAsStream, 0);
    }

    @Override // l.AbstractC17131
    /* JADX INFO: renamed from: ۬ */
    public final byte[] mo1454() throws IOException {
        InputStream resourceAsStream = C20659.class.getResourceAsStream("/assets/".concat("testkey.x509.pem"));
        if (resourceAsStream == null) {
            resourceAsStream = C16737.m39286().open("testkey.x509.pem");
        }
        return C19431.m44470(resourceAsStream, 0);
    }
}

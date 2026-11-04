package l;

import java.nio.file.attribute.FileAttribute;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: renamed from: l.ܰۙۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14353 implements FileAttribute {
    public final /* synthetic */ InterfaceC13885 a;

    @Override // java.nio.file.attribute.FileAttribute
    public final String name() {
        return "posix:permissions";
    }

    public C14353(InterfaceC13885 interfaceC13885) {
        this.a = interfaceC13885;
    }

    @Override // java.nio.file.attribute.FileAttribute
    public final Object value() {
        return Collections.unmodifiableSet(AbstractC1758.v((Set) this.a.value()));
    }
}

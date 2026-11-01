package l;

import java.nio.file.attribute.FileAttribute;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: renamed from: l.᩺᩷ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final class C23246 implements FileAttribute {
    public final /* synthetic */ InterfaceC20030 a;

    @Override // java.nio.file.attribute.FileAttribute
    public final String name() {
        return "posix:permissions";
    }

    public C23246(InterfaceC20030 interfaceC20030) {
        this.a = interfaceC20030;
    }

    @Override // java.nio.file.attribute.FileAttribute
    public final Object value() {
        return Collections.unmodifiableSet(AbstractC1726.v((Set) this.a.value()));
    }
}

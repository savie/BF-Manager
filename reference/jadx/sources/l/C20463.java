package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩵ۡܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: W9OU */
/* JADX INFO: loaded from: classes5.dex */
public class C20463 extends IOException {
    public static final long serialVersionUID = -1616151763072450476L;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC18775 f65564;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46972(InterfaceC18775 interfaceC18775) {
        this.f65564 = interfaceC18775;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final IOException m46971() {
        return getCause() instanceof IOException ? (IOException) getCause() : this;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C20463 m46963() {
        return new C20463("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static C20463 m46966() {
        return new C20463("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static C20463 m46967() {
        return new C20463("CodedInputStream encountered a malformed varint.");
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C20463 m46965() {
        return new C20463("Protocol message contained an invalid tag (zero).");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C20463 m46969() {
        return new C20463("Protocol message end-group tag did not match expected tag.");
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static C3309 m46968() {
        return new C3309("Protocol message tag had invalid wire type.");
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static C20463 m46964() {
        return new C20463("Failed to parse the message.");
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static C20463 m46970() {
        return new C20463("Protocol message had invalid UTF-8.");
    }
}

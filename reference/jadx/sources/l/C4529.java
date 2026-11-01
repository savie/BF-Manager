package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۙ۠᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: W9OU */
/* JADX INFO: loaded from: classes2.dex */
public class C4529 extends IOException {
    public static final long serialVersionUID = -1616151763072450476L;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public InterfaceC23206 f16117;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12651(InterfaceC23206 interfaceC23206) {
        this.f16117 = interfaceC23206;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final IOException m12650() {
        return getCause() instanceof IOException ? (IOException) getCause() : this;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static C4529 m12644() {
        return new C4529("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static C4529 m12642() {
        return new C4529("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static C4529 m12649() {
        return new C4529("CodedInputStream encountered a malformed varint.");
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C4529 m12646() {
        return new C4529("Protocol message contained an invalid tag (zero).");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C4529 m12648() {
        return new C4529("Protocol message end-group tag did not match expected tag.");
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static C3427 m12645() {
        return new C3427("Protocol message tag had invalid wire type.");
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static C4529 m12647() {
        return new C4529("Failed to parse the message.");
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static C4529 m12643() {
        return new C4529("Protocol message had invalid UTF-8.");
    }
}

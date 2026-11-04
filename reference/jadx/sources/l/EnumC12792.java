package l;

/* JADX INFO: renamed from: l.۫֫᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: K3OA */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC12792 {
    REF_GETFIELD((byte) 1, "REF_getField", "REF_GETFIELD"),
    REF_GETSTATIC((byte) 2, "REF_getStatic", "REF_GETSTATIC"),
    REF_PUTFIELD((byte) 3, "REF_putField", "REF_PUTFIELD"),
    REF_PUTSTATIC((byte) 4, "REF_putStatic", "REF_PUTSTATIC"),
    REF_INVOKEVIRTUAL((byte) 5, "REF_invokeVirtual", "REF_INVOKEVIRTUAL"),
    REF_INVOKESTATIC((byte) 6, "REF_invokeStatic", "REF_INVOKESTATIC"),
    REF_INVOKESPECIAL((byte) 7, "REF_invokeSpecial", "REF_INVOKESPECIAL"),
    REF_NEWINVOKESPECIAL((byte) 8, "REF_newInvokeSpecial", "REF_NEWINVOKESPECIAL"),
    REF_INVOKEINTERFACE((byte) 9, "REF_invokeInterface", "REF_INVOKEINTERFACE");


    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f40918;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Byte f40919;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f40920;

    EnumC12792(byte b, String str, String str2) {
        this.f40919 = Byte.valueOf(b);
        this.f40920 = str;
        this.f40918 = str2;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public byte m31680() {
        return this.f40919.byteValue();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String m31679() {
        return this.f40918;
    }

    @Override // java.lang.Enum
    public String toString() {
        return C8947.m23910(new StringBuilder("<"), this.f40920, "> ");
    }
}

package l;

import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: renamed from: l.۟ܳۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7947 extends AbstractC22338 {
    public static final /* synthetic */ int d = 0;
    public static final long serialVersionUID = 8386373296231747096L;
    public final String b;
    public final transient C21307 c;

    public static C7947 X(String str, boolean z) {
        C21307 c21307A;
        C17359.requireNonNull(str, "zoneId");
        int length = str.length();
        if (length >= 2) {
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if ((cCharAt < 'a' || cCharAt > 'z') && ((cCharAt < 'A' || cCharAt > 'Z') && ((cCharAt != '/' || i == 0) && ((cCharAt < '0' || cCharAt > '9' || i == 0) && ((cCharAt != '~' || i == 0) && ((cCharAt != '.' || i == 0) && ((cCharAt != '_' || i == 0) && ((cCharAt != '+' || i == 0) && (cCharAt != '-' || i == 0))))))))) {
                    throw new C21241("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
                }
            }
            try {
                c21307A = C0424.a(str);
            } catch (C18323 e) {
                if (z) {
                    throw e;
                }
                c21307A = null;
            }
            return new C7947(str, c21307A);
        }
        throw new C21241("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
    }

    public C7947(String str, C21307 c21307) {
        this.b = str;
        this.c = c21307;
    }

    @Override // l.AbstractC22338
    public final String getId() {
        return this.b;
    }

    @Override // l.AbstractC22338
    public final C21307 S() {
        C21307 c21307 = this.c;
        return c21307 != null ? c21307 : C0424.a(this.b);
    }

    private Object writeReplace() {
        return new C21372((byte) 7, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // l.AbstractC22338
    public final void W(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(7);
        dataOutput.writeUTF(this.b);
    }
}

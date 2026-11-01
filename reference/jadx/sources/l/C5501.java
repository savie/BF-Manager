package l;

import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: renamed from: l.ۚܿᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5501 extends AbstractC9114 {
    public static final /* synthetic */ int d = 0;
    public static final long serialVersionUID = 8386373296231747096L;
    public final String b;
    public final transient C15380 c;

    public static C5501 b0(String str, boolean z) {
        C15380 c15380A;
        C13638.requireNonNull(str, "zoneId");
        int length = str.length();
        if (length >= 2) {
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if ((cCharAt < 'a' || cCharAt > 'z') && ((cCharAt < 'A' || cCharAt > 'Z') && ((cCharAt != '/' || i == 0) && ((cCharAt < '0' || cCharAt > '9' || i == 0) && ((cCharAt != '~' || i == 0) && ((cCharAt != '.' || i == 0) && ((cCharAt != '_' || i == 0) && ((cCharAt != '+' || i == 0) && (cCharAt != '-' || i == 0))))))))) {
                    throw new C15464("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
                }
            }
            try {
                c15380A = C18201.a(str);
            } catch (C21729 e) {
                if (z) {
                    throw e;
                }
                c15380A = null;
            }
            return new C5501(str, c15380A);
        }
        throw new C15464("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
    }

    public C5501(String str, C15380 c15380) {
        this.b = str;
        this.c = c15380;
    }

    @Override // l.AbstractC9114
    public final String k() {
        return this.b;
    }

    @Override // l.AbstractC9114
    public final C15380 W() {
        C15380 c15380 = this.c;
        return c15380 != null ? c15380 : C18201.a(this.b);
    }

    private Object writeReplace() {
        return new C3944((byte) 7, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // l.AbstractC9114
    public final void a0(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(7);
        dataOutput.writeUTF(this.b);
    }
}

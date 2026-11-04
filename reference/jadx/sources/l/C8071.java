package l;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;

/* JADX INFO: renamed from: l.۟ᩳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: S6IE */
/* JADX INFO: loaded from: classes3.dex */
public final class C8071 implements Externalizable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Object f26708;

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        C15243.m36590(objectInput, "input");
        byte b = objectInput.readByte();
        if (b != 0) {
            throw new InvalidObjectException(C13645.m33382(b, "Unsupported flags value: "));
        }
        int i = objectInput.readInt();
        if (i < 0) {
            throw new InvalidObjectException("Illegal size value: " + i + '.');
        }
        C14782 c14782 = new C14782(i);
        for (int i2 = 0; i2 < i; i2++) {
            c14782.put(objectInput.readObject(), objectInput.readObject());
        }
        this.f26708 = c14782.m35603();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.Map] */
    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        C15243.m36590(objectOutput, "output");
        objectOutput.writeByte(0);
        objectOutput.writeInt(this.f26708.size());
        for (Map.Entry entry : this.f26708.entrySet()) {
            objectOutput.writeObject(entry.getKey());
            objectOutput.writeObject(entry.getValue());
        }
    }

    public C8071(Map map) {
        this.f26708 = map;
    }

    public C8071() {
        this.f26708 = C11053.f34872;
    }

    private final Object readResolve() {
        return this.f26708;
    }
}

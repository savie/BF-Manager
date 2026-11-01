package org.simpleframework.xml.stream;

import l.C8479;

/* JADX INFO: loaded from: classes2.dex */
public class InputPosition implements Position {
    public EventNode source;

    public InputPosition(EventNode eventNode) {
        this.source = eventNode;
    }

    @Override // org.simpleframework.xml.stream.Position
    public int getLine() {
        return this.source.getLine();
    }

    @Override // org.simpleframework.xml.stream.Position
    public String toString() {
        return C8479.m22141(getLine(), "line ");
    }
}

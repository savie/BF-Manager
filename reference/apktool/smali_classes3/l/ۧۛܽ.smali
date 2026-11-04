.class public final Ll/ۧۛܽ;
.super Ljava/io/Writer;
.source "TUG"


# instance fields
.field public final ܰ:Ljava/lang/StringBuilder;

.field public final ᩶:Ll/֫ۛܽ;


# direct methods
.method public constructor <init>(Ljava/lang/StringBuilder;)V
    .locals 1

    .line 82
    invoke-direct {p0}, Ljava/io/Writer;-><init>()V

    .line 80
    new-instance v0, Ll/֫ۛܽ;

    .line 135
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 80
    iput-object v0, p0, Ll/ۧۛܽ;->᩶:Ll/֫ۛܽ;

    .line 83
    iput-object p1, p0, Ll/ۧۛܽ;->ܰ:Ljava/lang/StringBuilder;

    return-void
.end method


# virtual methods
.method public final append(Ljava/lang/CharSequence;)Ljava/io/Writer;
    .locals 1

    .line 124
    iget-object v0, p0, Ll/ۧۛܽ;->ܰ:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    return-object p0
.end method

.method public final append(Ljava/lang/CharSequence;II)Ljava/io/Writer;
    .locals 1

    .line 130
    iget-object v0, p0, Ll/ۧۛܽ;->ܰ:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/Appendable;

    return-object p0
.end method

.method public final append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    .locals 1

    .line 124
    iget-object v0, p0, Ll/ۧۛܽ;->ܰ:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    return-object p0
.end method

.method public final append(Ljava/lang/CharSequence;II)Ljava/lang/Appendable;
    .locals 1

    .line 130
    iget-object v0, p0, Ll/ۧۛܽ;->ܰ:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/Appendable;

    return-object p0
.end method

.method public final close()V
    .locals 2

    .line 102
    iget-object v0, p0, Ll/ۧۛܽ;->ܰ:Ljava/lang/StringBuilder;

    instance-of v1, v0, Ljava/io/Closeable;

    if-eqz v1, :cond_0

    .line 103
    check-cast v0, Ljava/io/Closeable;

    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    :cond_0
    return-void
.end method

.method public final flush()V
    .locals 2

    .line 95
    iget-object v0, p0, Ll/ۧۛܽ;->ܰ:Ljava/lang/StringBuilder;

    instance-of v1, v0, Ljava/io/Flushable;

    if-eqz v1, :cond_0

    .line 96
    check-cast v0, Ljava/io/Flushable;

    invoke-interface {v0}, Ljava/io/Flushable;->flush()V

    :cond_0
    return-void
.end method

.method public final write(I)V
    .locals 1

    .line 112
    iget-object v0, p0, Ll/ۧۛܽ;->ܰ:Ljava/lang/StringBuilder;

    int-to-char p1, p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    return-void
.end method

.method public final write(Ljava/lang/String;II)V
    .locals 1

    .line 118
    invoke-static {p1}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    iget-object v0, p0, Ll/ۧۛܽ;->ܰ:Ljava/lang/StringBuilder;

    add-int/2addr p3, p2

    invoke-virtual {v0, p1, p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/Appendable;

    return-void
.end method

.method public final write([CII)V
    .locals 1

    .line 89
    iget-object v0, p0, Ll/ۧۛܽ;->᩶:Ll/֫ۛܽ;

    invoke-virtual {v0, p1}, Ll/֫ۛܽ;->ۙ([C)V

    .line 90
    iget-object p1, p0, Ll/ۧۛܽ;->ܰ:Ljava/lang/StringBuilder;

    add-int/2addr p3, p2

    invoke-virtual {p1, v0, p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/Appendable;

    return-void
.end method

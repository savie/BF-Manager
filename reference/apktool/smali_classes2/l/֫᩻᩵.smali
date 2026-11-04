.class public final Ll/֫᩻᩵;
.super Ljava/lang/Object;
.source "65V2"


# instance fields
.field public final ۙ:Ljava/nio/ByteBuffer;

.field public final ۤ:Ljava/lang/String;

.field public final ᩷:Ll/ܽܺ᩵;

.field public final ᩸:I


# direct methods
.method public constructor <init>(IILjava/lang/String;[B)V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput p1, p0, Ll/֫᩻᩵;->᩸:I

    .line 20
    iput-object p3, p0, Ll/֫᩻᩵;->ۤ:Ljava/lang/String;

    .line 21
    invoke-static {p4}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    iput-object p1, p0, Ll/֫᩻᩵;->ۙ:Ljava/nio/ByteBuffer;

    .line 22
    new-instance p1, Ll/ܽܺ᩵;

    new-instance p3, Ll/ۨܺ᩵;

    invoke-direct {p3, p0, p2}, Ll/ۨܺ᩵;-><init>(Ll/֫᩻᩵;I)V

    invoke-direct {p1, p3}, Ll/ܽܺ᩵;-><init>(Ll/ۨܺ᩵;)V

    iput-object p1, p0, Ll/֫᩻᩵;->᩷:Ll/ܽܺ᩵;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    .line 58
    iget-object v0, p0, Ll/֫᩻᩵;->ۤ:Ljava/lang/String;

    return-object v0
.end method

.method public final ۙ()Ljava/nio/ByteBuffer;
    .locals 1

    .line 41
    iget-object v0, p0, Ll/֫᩻᩵;->ۙ:Ljava/nio/ByteBuffer;

    return-object v0
.end method

.method public final ۙ(Ll/᩸۫᩸;)V
    .locals 5

    .line 26
    iget-object v0, p0, Ll/֫᩻᩵;->᩷:Ll/ܽܺ᩵;

    invoke-virtual {v0}, Ll/ܽܺ᩵;->ۤ()I

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    .line 30
    :cond_0
    invoke-virtual {v0}, Ll/ܽܺ᩵;->᩷()I

    move-result v0

    .line 31
    new-instance v2, Ll/ۨܺ᩵;

    invoke-direct {v2, p0, v0}, Ll/ۨܺ᩵;-><init>(Ll/֫᩻᩵;I)V

    .line 32
    new-instance v0, Ll/ۛܺ᩵;

    invoke-virtual {v2}, Ll/ۨܺ᩵;->ۙ()Ll/ۨܺ᩵;

    move-result-object v3

    invoke-virtual {v2}, Ll/ۨܺ᩵;->ۙ()Ll/ۨܺ᩵;

    move-result-object v4

    invoke-direct {v0, v3, v4}, Ll/ۛܺ᩵;-><init>(Ll/ۨܺ᩵;Ll/ۨܺ᩵;)V

    .line 33
    new-instance v3, Ll/ۧܺ᩵;

    invoke-direct {v3, v2, v0}, Ll/ۧܺ᩵;-><init>(Ll/ۨܺ᩵;Ll/ۛܺ᩵;)V

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_1

    .line 35
    invoke-virtual {p1, v3}, Ll/᩸۫᩸;->accept(Ljava/lang/Object;)V

    .line 36
    invoke-virtual {v2}, Ll/ۨܺ᩵;->᩹()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public final ۤ()Ljava/lang/String;
    .locals 1

    .line 49
    iget-object v0, p0, Ll/֫᩻᩵;->ۤ:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩷()Ll/ܽܺ᩵;
    .locals 1

    .line 45
    iget-object v0, p0, Ll/֫᩻᩵;->᩷:Ll/ܽܺ᩵;

    return-object v0
.end method

.method public final ᩸()I
    .locals 1

    .line 53
    iget v0, p0, Ll/֫᩻᩵;->᩸:I

    return v0
.end method

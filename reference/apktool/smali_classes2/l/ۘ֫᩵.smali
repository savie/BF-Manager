.class public final Ll/ۘ֫᩵;
.super Ljava/lang/Object;
.source "Y4VB"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public ܰ:I

.field public final synthetic ܿ:Ll/ܰ֫᩵;

.field public final ᩶:I


# direct methods
.method public constructor <init>(Ll/ܰ֫᩵;)V
    .locals 0

    .line 90
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۘ֫᩵;->ܿ:Ll/ܰ֫᩵;

    .line 91
    invoke-static {p1}, Ll/ܰ֫᩵;->ۙ(Ll/ܰ֫᩵;)[Ljava/lang/Object;

    move-result-object p1

    array-length p1, p1

    iput p1, p0, Ll/ۘ֫᩵;->᩶:I

    const/4 p1, 0x0

    .line 92
    iput p1, p0, Ll/ۘ֫᩵;->ܰ:I

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 2

    .line 96
    iget v0, p0, Ll/ۘ֫᩵;->ܰ:I

    iget v1, p0, Ll/ۘ֫᩵;->᩶:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 3

    .line 102
    :try_start_0
    iget-object v0, p0, Ll/ۘ֫᩵;->ܿ:Ll/ܰ֫᩵;

    invoke-static {v0}, Ll/ܰ֫᩵;->ۙ(Ll/ܰ֫᩵;)[Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Ll/ۘ֫᩵;->ܰ:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/ۘ֫᩵;->ܰ:I

    aget-object v0, v0, v1
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 104
    new-instance v1, Ljava/util/NoSuchElementException;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

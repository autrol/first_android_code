package com.example.servicebestpractice;

/**
 * Created by yangzhinian on 2017/8/22.
 */

public interface DownloadListener {
    void onProgress(int progress);

    void onSuccess();

    void onFailed();

    void onPaused();

    void onCanceled();
}
